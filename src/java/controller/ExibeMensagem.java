/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Admin
 */
public class ExibeMensagem {
    
    private static String mensagem="";
    
    public static void setMensagem(String mensagem){
        ExibeMensagem.mensagem = mensagem;
    }
    
    public static String getMensagem(){
        return mensagem;
    }
    
}
