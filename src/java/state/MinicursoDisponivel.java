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
        return "Minicurso Em Execução";
    }

    public String fechar() {
        return "Minicurso não pode ser fechado";
    }

    public String cancelar() {
        return "Minicurso Cancelado";
    }

    public String adiar() {
        return "Minicurso Adiado";
    }
    public String toString(){
        return this.getEstado();
    }
}
