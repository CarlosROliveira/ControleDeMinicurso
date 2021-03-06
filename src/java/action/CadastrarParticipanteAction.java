/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import controller.ExibeStrategy;
import controller.StrategyFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import observer.Participante;
import persistence.MinicursoDAO;

/**
 *
 * @author Admin
 */
public class CadastrarParticipanteAction implements Action{

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String formaPagamento = request.getParameter("forma");
        Participante participante = new Participante(MinicursoDAO.getInstance().getMinicurso(id));
        
        ExibeStrategy.setFormaDePagamento(StrategyFactory.obtemFormaPagamento(formaPagamento));
  
        try {
            MinicursoDAO.getInstance().updateVagas(id);
            response.sendRedirect("frontcontroller?action=Strategy");
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarParticipanteAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarParticipanteAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
