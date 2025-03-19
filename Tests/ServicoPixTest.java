package Tests;
import arqfactory.ServicoFactory;
import arqfactory.IServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPixTest {

    @Test
    void deveExecutarPagamentoviaPix() {
        IServico servico = ServicoFactory.obterServico("Pix");
        assertEquals("Executando pagamento via Pix", servico.pagar());
    }

    @Test
    void deveEstornarPix() {
        IServico servico = ServicoFactory.obterServico("Pix");
        assertEquals("Executando estorno de pagamento", servico.estornar());
    }
}