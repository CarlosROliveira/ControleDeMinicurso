/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import state.MinicursoEstado;
import strategy.FormaDePagamento;

/**
 *
 * @author Admin
 */
public class StrategyFactory {
    
    public static FormaDePagamento obtemFormaPagamento(String pagamento){
        FormaDePagamento formaPagamento = null;
        String nomeClasse = "strategy." + pagamento;
        Class classe = null;
        Object object = null;
        try {
            classe = Class.forName(nomeClasse);
            object = classe.newInstance();
        } catch (Exception ex) {
            return null;
        }
        if(!(object instanceof FormaDePagamento)) return null;
        formaPagamento = (FormaDePagamento) object;
        return formaPagamento;
    }
    
}
