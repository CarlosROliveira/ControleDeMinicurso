/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import state.Minicurso;
//import javax.servlet.http.HttpServletResponse;
//import model.Personagem;
import persistence.ContatoDAO;

/**
 *
 * @author Gilson
 */
public class GravarContatoAction implements Action {

    public GravarContatoAction(Minicurso minicurso) {
    }

    public void execute(Minicurso minicurso) throws IOException {
        String titulo = minicurso.getTitulo();
        String dtInicio = minicurso.getDataInicio();
        String duracao = minicurso.getDuracao();
        if (titulo.equals("") || dtInicio.equals("") || duracao.equals("")) {
            System.out.println("Ta vazio");
            // response.sendRedirect("index.jsp");
        } else {
            Minicurso contato = new Minicurso();
            contato.setTitulo(titulo);
            contato.setDataInicio(dtInicio);
            contato.setDuracao(duracao);
            try {
                ContatoDAO.getInstance().save(contato);
                System.out.println("Deu certo");
                //response.sendRedirect("contatoSucesso.jsp");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                System.out.println("Deu ruim");
                //response.sendRedirect("contatoErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
