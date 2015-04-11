package model;

import state.MinicursoDisponivel;
import state.MinicursoEstado;

/**
 *
 * @author Gilson
 */
public class Minicurso {
    private int id;
    private String titulo;
    private String dataInicio;
    private String duracao;
    private float valor;
    private MinicursoEstado minicursoEstado;
    private int vagasDisp;
    
    public Minicurso() {
        this.minicursoEstado = new MinicursoDisponivel();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVagasDisp() {
        return vagasDisp;
    }

    public void setVagasDisp(int vagasDisp) {
        this.vagasDisp = vagasDisp;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public MinicursoEstado getMinicursoEstado() {
        return minicursoEstado;
    }

    public void setMinicursoEstado(MinicursoEstado minicursoEstado) {
        this.minicursoEstado = minicursoEstado;
    }

}
