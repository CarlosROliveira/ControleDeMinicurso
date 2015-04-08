package strategy;

/**
 *
 * @author Gilson
 */
public class PromocaoBoleto implements Promocao{
    
    public int obterDesconto() {
        return 10;
    }


    public String obterPromocao() {
        return "Promoção Boleto";
    }
    
}
