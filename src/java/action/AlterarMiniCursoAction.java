package action;

import controller.Action;
import controller.MEstadoFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import persistence.MinicursoDAO;
import state.MinicursoEstado;

/**
 *
 * @author Gilson
 */
public class AlterarMiniCursoAction implements Action {

    public AlterarMiniCursoAction() {}

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String estadoAtual = request.getParameter("status");
        String estadoNovo = request.getParameter("estado");
  
        MinicursoEstado minicursoEstado = MEstadoFactory.obtemEstado(estadoAtual);
        
        try {
            MinicursoDAO.getInstance().update(id, estadoNovo);
            //MinicursoDAO.getInstance().update(id, chamaMetodo(minicursoEstado,estadoNovo));
            response.sendRedirect("frontcontroller?action=LerMiniCurso");
        } catch (SQLException ex) {
            Logger.getLogger(GravarMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GravarMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
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
