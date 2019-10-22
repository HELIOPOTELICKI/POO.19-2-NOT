

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcel
 */
public class ManutencaoTest {
    
    public ManutencaoTest() {
    }


    /**
     * Test of setNumero method, of class Manutencao.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 1;
        Manutencao instance = new Manutencao();
        instance.setNumero(numero);
        assertEquals(numero, instance.getNumero());
    }

    /**
     * Test of setNumero method, of class Manutencao.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testSetNumeroInvalido() {
        System.out.println("setNumero Invalido");
        int numero = 1;
        Manutencao instance = new Manutencao();
        instance.setNumero(numero);
    }    

    /**
     * Test of getCustoMedioDiario method, of class Manutencao.
     */
    @Test
    public void testGetCustoMedioDiario() {
        System.out.println("getCustoMedioDiario");
        Manutencao instance = new Manutencao();
        instance.setCusto(200);
        instance.setTempo(4);
        float expResult = 50.0F;
        float result = instance.getCustoMedioDiario();
        assertEquals(expResult, result, 0.0);
    }
    
}
