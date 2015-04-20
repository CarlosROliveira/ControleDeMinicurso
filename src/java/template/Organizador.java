/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.Observable;


/**
 *
 */
public abstract class Organizador {
       
    
    public abstract String getCargo();
    
    public String getFuncionario() {
        
        return "Alterado pelo " +getCargo();             
    }
    
    
    
}
