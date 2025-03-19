package Tests;
import arqfactory.ServicoFactory;
import arqfactory.IServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoBoletoTest {

    @Test
    void deveExecutarPagamentoviaBoleto() {
        IServico servico = ServicoFactory.obterServico("Boleto");
        assertEquals("Executando pagamento via Boleto", servico.pagar());
    }

    @Test
    void deveEstornarPagamento() {
        IServico servico = ServicoFactory.obterServico("Boleto");
        assertEquals("Executando estorno de pagamento", servico.estornar());
    }
}