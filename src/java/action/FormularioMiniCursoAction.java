/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Minicurso;

/**
 *
 * @author Gilson
 */
public class FormularioMiniCursoAction implements Action{

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("adicionar.jsp");
    }
    
}
