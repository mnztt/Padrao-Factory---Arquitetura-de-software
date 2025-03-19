package arqfactory;

public class ServicoBoleto implements IServico {
    public String pagar() {
        return("Executando pagamento via Boleto");
    }

    public String estornar() {
        return("Executando estorno de pagamento");
    }
}