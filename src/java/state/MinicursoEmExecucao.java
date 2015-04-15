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
        return "Minicurso Em Execução";
    }

    public String disponibilizar() {
        return "Minicurso não pode ficar disponível";
    }

    public String executar() {
        return "Minicurso já em execução";
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
    public String toString(){
        return this.getEstado();
    }
}
