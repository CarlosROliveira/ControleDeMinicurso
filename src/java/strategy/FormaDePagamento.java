package strategy;

/**
 *
 * @author Gilson
 */
public abstract class FormaDePagamento {
    
    protected Promocao promocao;
    protected String nome;
    
    public int desconto() {
        return promocao.obterDesconto();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getPromocao() {
        return promocao.obterPromocao();
    }
    
}
