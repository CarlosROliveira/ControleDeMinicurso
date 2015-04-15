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
public class MinicursoDisponivel implements MinicursoEstado{

    public String getEstado() {
        return "Minicurso Disponível";
    }

    public String disponibilizar() {
        return "Minicurso já disponível";
    }

    public String executar() {
        return "Minicurso em execução";
    }

    public String fechar() {
        return "Minicurso não pode ser fechado";
    }

    public String cancelar() {
        return "Minicurso cancelado";
    }

    public String adiar() {
        return "Minicurso adiado";
    }
    public String toString(){
        return this.getEstado();
    }
}
