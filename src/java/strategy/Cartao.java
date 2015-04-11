package strategy;

/**
 *
 * @author Gilson
 */
public class Cartao extends FormaDePagamento{

    public Cartao(){
        this.nome="Cartão";
        this.promocao = new PromocaoCartao();
    }
    
}
