package controller;

import state.MinicursoEstado;

/**
 *
 * @author Admin
 */
public class MEstadoFactory {
    
    public static MinicursoEstado obtemEstado(String estado){
        MinicursoEstado minicursoEstado = null;
        String nomeClasse = "state." + estado.replaceAll(" ", "").replaceAll("í", "i").replaceAll("ç", "c").replaceAll("ã", "a");
        Class classe = null;
        Object object = null;
        try {
            classe = Class.forName(nomeClasse);
            object = classe.newInstance();
        } catch (Exception ex) {
            return null;
        }
        if(!(object instanceof MinicursoEstado)) return null;
        minicursoEstado = (MinicursoEstado) object;
        return minicursoEstado;
    }
    
}
