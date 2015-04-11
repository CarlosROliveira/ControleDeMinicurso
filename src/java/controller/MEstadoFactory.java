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
        else if(estado.equals("Minicurso Cancelado"))
           return new MinicursoCancelado();
        else if(estado.equals("Minicurso Disponível"))
           return new MinicursoDisponivel();
        else if(estado.equals("Minicurso em Execução"))
           return new MinicursoEmExecucao();
        else
           return new MinicursoFechado();
    }
    
}
