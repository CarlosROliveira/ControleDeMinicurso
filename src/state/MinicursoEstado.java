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
public interface MinicursoEstado {
    
    public String getEstado();
    
    public String disponibilizar();
    
    public String executar();
    
    public String fechar();
    
    public String cancelar();
    
    public String adiar();
    
}
