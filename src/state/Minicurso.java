package state;

import strategy.FormaDePagamento;
import strategy.Promocao;

/**
 *
 * @author Gilson
 */
public class Minicurso {

    private String titulo;
    private String dataInicio;
    private String duração;
    private double valor;
    private MinicursoEstado minicursoEstado;
    private FormaDePagamento formaDePagamento;
    private Promocao promocao;
    
    public Minicurso(){
        this.minicursoEstado = new MinicursoDisponivel();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public MinicursoEstado getMinicursoEstado() {
        return minicursoEstado;
    }

    public void setMinicursoEstado(MinicursoEstado minicursoEstado) {
        this.minicursoEstado = minicursoEstado;
    }
    
}
