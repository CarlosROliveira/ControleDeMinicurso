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
public class MinicursoCancelado implements MinicursoEstado{
    
    public String getEstado() {
        return "Minicurso Cancelado";
    }

    public String disponibilizar() {
        return "Minicurso não pode ficar dispon�vel";
    }

    public String executar() {
        return "Minicurso n�o pode entrar em execu��o";
    }

    public String fechar() {
        return "Minicurso n�o pode ser fechado";
    }

    public String cancelar() {
        return "Minicurso j� cancelado";
    }

    public String adiar() {
        return "Minicurso n�o pode ser adiado";
    }
    
}
