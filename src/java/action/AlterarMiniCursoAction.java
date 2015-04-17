package action;

import controller.Action;
import controller.ExibeMensagem;
import controller.MEstadoFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import model.Minicurso;
import observer.Participante;
import persistence.MinicursoDAO;
import state.MinicursoEstado;
import template.Organizador;



public class AlterarMiniCursoAction implements Action {

    public AlterarMiniCursoAction() {}

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String estadoAtual = request.getParameter("status");
        String estadoNovo = request.getParameter("estado");
  
        MinicursoEstado minicursoEstado = MEstadoFactory.obtemEstado(estadoAtual);
        String retornoTroca = chamaMetodo(minicursoEstado, estadoNovo);
        MinicursoEstado minicursoEstadoNovo = MEstadoFactory.obtemEstado(retornoTroca);
        
        try {
            MinicursoDAO.getInstance().update(id, minicursoEstadoNovo.getEstado());
            response.sendRedirect("frontcontroller?action=LerMiniCurso");
            Organizador.getFuncionario();
        } catch (Exception ex) {
            ExibeMensagem.setMensagem(retornoTroca);
            response.sendRedirect("frontcontroller?action=ErroTrocarEstado");
        }
    }
    
    private String chamaMetodo(MinicursoEstado minicursoEstado, String metodo){
        try {
            Method method = minicursoEstado.getClass().getDeclaredMethod(metodo, new Class<?>[]{});
            Object result = method.invoke(minicursoEstado, new Object[]{});
            return result.toString();
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(AlterarMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AlterarMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(AlterarMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
