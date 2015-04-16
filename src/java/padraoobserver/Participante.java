package padraoobserver;

import controller.ExibeMensagem;
import controller.ExibeMensagemObserver;
import java.util.Observable;
import java.util.Observer;
import model.Minicurso;

/**
 *
 * @author Marco
 */
public class Participante implements Observer {

    Observable minicurso;
    String estadoNovoMinicurso;

    public Participante(Observable minicurso) {
        this.minicurso = minicurso;
        minicurso.addObserver(this);
    }

    @Override
    public void update(Observable minicursoState, Object arg1) {
        if (minicursoState instanceof Minicurso) {
            Minicurso minicurso = (Minicurso) minicursoState;
            estadoNovoMinicurso = minicurso.getMinicursoEstado().getEstado();
            estadoNovoMinicurso = " Atenção, o minicurso está ".concat(estadoNovoMinicurso);
            ExibeMensagemObserver.setMensagem(estadoNovoMinicurso);
        }
    }
    
}
