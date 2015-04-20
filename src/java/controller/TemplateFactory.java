/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import template.Organizador;

/**
 *
 * @author Gilson
 */
public class TemplateFactory {
    public static Organizador obtemFuncionario(String funcionario){
        Organizador organizadorObject = null;
        String nomeClasse = "template." + funcionario;
        Class classe = null;
        Object object = null;
        try {
            classe = Class.forName(nomeClasse);
            object = classe.newInstance();
        } catch (Exception ex) {
            return null;
        }
        if(!(object instanceof Organizador)) return null;
        organizadorObject = (Organizador) object;
        return organizadorObject;
    }
}
