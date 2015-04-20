package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Minicurso;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import observer.Participante;
import persistence.MinicursoDAO;

/**
 *
 * @author Gilson
 */
public class GravarMiniCursoAction implements Action {

    public GravarMiniCursoAction() {}

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String titulo     = request.getParameter("titulo");
        String dataInicio = request.getParameter("dataInicio");
        String duracao    = request.getParameter("duracao");
        float valor       = Float.valueOf(request.getParameter("valor"));
        Integer vagasDisp = Integer.parseInt(request.getParameter("vagasDisp"));
        
        Minicurso minicurso = new Minicurso();
        minicurso.setTitulo(titulo);
        minicurso.setDataInicio(dataInicio);
        minicurso.setDuracao(duracao);
        minicurso.setValor(valor);
        minicurso.setVagasDisp(vagasDisp);
        
        try {
            MinicursoDAO.getInstance().save(minicurso);
            response.sendRedirect("frontcontroller?action=index");
        } catch (SQLException ex) {
            Logger.getLogger(GravarMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GravarMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
