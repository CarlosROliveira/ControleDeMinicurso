/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import controller.ExibeMensagemTemplate;


/**
 *
 */
public abstract class Organizador{
       
    
    public abstract String getCargo();
    
    public void getFuncionario() {
        ExibeMensagemTemplate.setMensagem("Alterado pelo " +getCargo());             
    }

    
    
    
}
