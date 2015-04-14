package controller;

import state.MinicursoAdiado;
import state.MinicursoCancelado;
import state.MinicursoDisponivel;
import state.MinicursoEmExecucao;
import state.MinicursoEstado;
import state.MinicursoFechado;

/**
 *
 * @author Admin
 */
public class MEstadoFactory {
    
    public static MinicursoEstado obtemEstado(String estado){
        if(estado.equals("Minicurso Adiado"))
            return new MinicursoAdiado();
        if(estado.equals("Minicurso Cancelado"))
           return new MinicursoCancelado();
        if(estado.equals("Minicurso Disponivel"))
           return new MinicursoDisponivel();
        if(estado.equals("Minicurso em Execucao"))
           return new MinicursoEmExecucao();
        if(estado.equals("Minicurso Fechado"))
           return new MinicursoFechado();
        return null;
    }
    
}
