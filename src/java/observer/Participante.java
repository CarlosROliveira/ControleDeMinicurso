/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;
import model.Minicurso;

/**
 *
 * @author Gilson
 */
public class Participante implements Observer {
   
    Observable minicurso;
    String estado;

    public Participante(Observable minicurso) {
        this.minicurso = minicurso;
        minicurso.addObserver(this);
    }

    @Override
    public void update(Observable minicursoState, Object arg1) {
        if (minicursoState instanceof Minicurso) {
            Minicurso minicurso = (Minicurso) minicursoState;
            estado = minicurso.getMinicursoEstado().getEstado();
            System.out.println("Atenção, estado alterado para " + estado);
        }
    }
    
}
