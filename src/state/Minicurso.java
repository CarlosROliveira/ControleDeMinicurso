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
    private String duracao;
    private double valor;
    private MinicursoEstado minicursoEstado;
    private int vagasDisp;
    public Minicurso() {
        this.minicursoEstado = new MinicursoDisponivel();
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
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
