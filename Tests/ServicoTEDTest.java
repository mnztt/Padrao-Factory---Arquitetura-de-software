package Tests;
import arqfactory.ServicoFactory;
import arqfactory.IServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTEDTest {

    @Test
    void deveExecutarPagamentoviaTED() {
        IServico servico = ServicoFactory.obterServico("TED");
        assertEquals("Executando pagamento via TED", servico.pagar());
    }

    @Test
    void deveEstornarPagamento() {
        IServico servico = ServicoFactory.obterServico("TED");
        assertEquals("Executando estorno de pagamento", servico.estornar());
    }
}