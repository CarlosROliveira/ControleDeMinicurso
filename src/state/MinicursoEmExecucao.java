/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Gilson
 */
public class MinicursoEmExecucao implements MinicursoEstado{
    
    public String getEstado() {
        return "Minicurso em Execu��o";
    }

    public String disponibilizar() {
        return "Minicurso n�o pode ficar dispon�vel";
    }

    public String executar() {
        return "Minicurso j� em execu��o";
    }

    public String fechar() {
        return "Minicurso fechado";
    }

    public String cancelar() {
        return "Minicurso n�o pode ser cancelado";
    }

    public String adiar() {
        return "Minicurso n�o pode ser adiado adiado";
    }
    
}
