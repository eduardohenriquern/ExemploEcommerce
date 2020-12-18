import br.ufrn.ecommerce.Ecommerce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EcommerceTest {

    private double esperado;
    private String tipoCliente;
    private double precoDaCompra;

    public EcommerceTest(double precoDaCompra, String tipoCliente, double esperado) {
        this.esperado = esperado;
        this.tipoCliente = tipoCliente;
        this.precoDaCompra = precoDaCompra;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> addParametros(){
        return Arrays.asList(new Object[][]{
                {49, "cashback", 49},
                {50, "cashback", 47.50},
                {99, "cashback", 94.05},
                {100, "cashback", 92},
                {251, "cashback", 220.88},
                {250, "cashback", 230},
                {799, "cashback", 703.12},
                {800, "cashback", 680},
                {50, "cartao", 45},
                {49, "cartao", 49}
        });
    }

    @Test
    public void testCalcularDesconto(){
        Ecommerce ec = new Ecommerce();
        System.out.println("Passando os parâmetros: "
                + this.tipoCliente + " e " + this.precoDaCompra);
        assertEquals(this.esperado, ec.calcularPagamento(this.tipoCliente, this.precoDaCompra), 0.1);
    }
}
