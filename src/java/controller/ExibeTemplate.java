/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import template.Organizador;

/**
 *
 * @author Admin
 */
public class ExibeTemplate {
    
    private static Organizador organizador;
    
    public static void setOrganizador(Organizador organizador){
        ExibeTemplate.organizador = organizador;
    }
    
    public static Organizador getOrganizador(){
        return organizador;
    }
    
}
