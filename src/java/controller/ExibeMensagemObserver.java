/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Observable;

/**
 *
 * @author Admin
 */
public class ExibeMensagemObserver extends Observable{
    
    private static String mensagem="";
    
    public static void setMensagem(String mensagem){
        ExibeMensagemObserver.mensagem = mensagem;
    }
    
    public static String getMensagem(){
  
        return mensagem;
    }
    
}
