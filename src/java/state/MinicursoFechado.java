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
public class MinicursoFechado implements MinicursoEstado{
    
    public String getEstado() {
        return "Minicurso Fechado";
    }

    public String disponibilizar() {
        return "Minicurso não pode ficar disponível";
    }

    public String executar() {
        return "Minicurso não pode entrar em execução";
    }

    public String fechar() {
        return "Minicurso já fechado";
    }

    public String cancelar() {
        return "Minicurso não pode ser cancelado";
    }

    public String adiar() {
        return "Minicurso não pode ser adiado";
    }
    public String toString(){
        return this.getEstado();
    }
}
