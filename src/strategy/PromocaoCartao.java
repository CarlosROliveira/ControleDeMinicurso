package strategy;

/**
 *
 * @author Gilson
 */
public class PromocaoCartao implements Promocao{

    public int obterDesconto() {
        return 5;
    }


    public String obterPromocao() {
        return "Promo��o Cart�o";
    }
    
}
