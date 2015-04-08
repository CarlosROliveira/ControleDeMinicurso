package strategy;

/**
 *
 * @author Gilson e Carlos
 */
public class Boleto extends FormaDePagamento{

    public Boleto(){
        this.nome = "Boleto";
        this.promocao = new PromocaoBoleto();
    }
    
}
