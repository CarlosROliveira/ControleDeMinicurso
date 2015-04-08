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
        return "Minicurso não pode ficar disponível";
    }

    public String executar() {
        return "Minicurso não pode entrar em execução";
    }

    public String fechar() {
        return "Minicurso não pode ser fechado";
    }

    public String cancelar() {
        return "Minicurso já cancelado";
    }

    public String adiar() {
        return "Minicurso não pode ser adiado";
    }
    
}
