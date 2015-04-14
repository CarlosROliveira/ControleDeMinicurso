/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author Marco
 */
public abstract class Participante {
    
    private String nome;
    private String instituicaoOrigem;
    
    public abstract String getOrigem();
    
    public String getDadosAluno() {
        return "Participante: " + getNome() + " da instituição " +getOrigem()+ " foi cadastrado com sucesso.";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the instituicaoOrigem
     */
    public String getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    /**
     * @param instituicaoOrigem the instituicaoOrigem to set
     */
    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }
}
