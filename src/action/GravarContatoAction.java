/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import model.Personagem;
import persistence.ContatoDAO;



/**
 *
 * @author Gilson
 */
public class GravarContatoAction implements Action{
    
    public GravarContatoAction() {
    }
//    public void execute(HttpServletRequest request, HttpServletResponse response)
//            throws IOException {
//        String nome = request.getParameter("textNome");
//        String elemento = request.getParameter("Selected");  
//        String estrelas = request.getParameter("textEstrelas");
//            if(nome.equals("") || elemento.equals("")) {
//            response.sendRedirect("index.jsp");
//        } else {
//          Personagem contato = new Personagem(nome, elemento, estrelas);
//          try {              
//              ContatoDAO.getInstance().save(contato);
//              response.sendRedirect("contatoSucesso.jsp");
//          } catch (ClassNotFoundException ex) {
//              ex.printStackTrace();
//          } catch (SQLException ex) {
//              response.sendRedirect("contatoErro.jsp");
//              ex.printStackTrace();
//          }
//        }
//    }
}
