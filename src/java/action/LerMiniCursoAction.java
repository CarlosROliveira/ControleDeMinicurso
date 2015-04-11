/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Minicurso;
import persistence.MinicursoDAO;

/**
 *
 * @author Gilson
 */
public class LerMiniCursoAction implements Action{

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
       List<Minicurso> minicursos = MinicursoDAO.getInstance().getAll();
       request.setAttribute("minicursos", minicursos);
        try {
            request.getRequestDispatcher("lista.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(LerMiniCursoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
