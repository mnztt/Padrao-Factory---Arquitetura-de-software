package arqfactory;

public class ServicoTED implements IServico{
    public String pagar() {
        return "Executando pagamento via TED";
    }
    public String estornar(){
        return "Executando estorno de pagamento";
    }
}
