package arqfactory;

public class ServicoPix implements IServico {
    public String pagar(){
        return "Executando pagamento via Pix";
    }

    public String estornar(){
        return "Executando estorno de pagamento";
    }

}
