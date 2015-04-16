/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import strategy.FormaDePagamento;

/**
 *
 * @author Admin
 */
public class ExibeStrategy {
    
    private static FormaDePagamento formaDePagamento;
    
    public static void setFormaDePagamento(FormaDePagamento formaDePagamento){
        ExibeStrategy.formaDePagamento = formaDePagamento;
    }
    
    public static FormaDePagamento getFormaDePagamento(){
        return formaDePagamento;
    }
    
}
