
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcel
 */
public class VendedorTest {
    
    public VendedorTest() {
    }

    /**
     * Test of getTotalKm method, of class Vendedor.
     */
    @Test
    public void testGetTotalKm01() {
        System.out.println("getTotalKm 01");
        Vendedor instance = new Vendedor("João da Silva");
        instance.addViagem(2,400,500.00);
        instance.addViagem(1,150,620.00);
        instance.addViagem(2,255,130.00);
        
        int expResult = 805;
        int result = instance.getTotalKm();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTotalKm02() {
        System.out.println("getTotalKm 02");
        Vendedor instance = new Vendedor("Maria Pedrosa");
        instance.addViagem(1,145,900.00);
        
        int expResult = 145;
        int result = instance.getTotalKm();
        assertEquals(expResult, result);
    }    
    /**
     * Test of getValorASerPago method, of class Vendedor.
     */
    @Test
    public void testGetValorASerPago03() {
        System.out.println("getValorASerPago03");
        Vendedor instance = new Vendedor("João da Silva");
        instance.addViagem(2,400,500.00);
        instance.addViagem(1,150,620.00);
        instance.addViagem(2,255,130.00);
        double expResult = 627.90;
        double result = instance.getValorASerPago();
        assertEquals(expResult, result, 0.009);
    }

    @Test
    public void testGetValorASerPago04() {
        System.out.println("getValorASerPago04");
        Vendedor instance = new Vendedor("Maria Pedrosa");
        instance.addViagem(1,145,900.00);
        double expResult = 116.00;
        double result = instance.getValorASerPago();
        assertEquals(expResult, result, 0.009);
    }
    
    /**
     * Test of getTotalVendas method, of class Vendedor.
     */
    @Test
    public void testGetTotalVendas06() {
        System.out.println("getTotalVendas06");
        Vendedor instance = new Vendedor("João da Silva");
        instance.addViagem(2,400,500.00);
        instance.addViagem(1,150,620.00);
        instance.addViagem(2,255,130.00);
        double expResult = 1250.00;
        double result = instance.getTotalVendas();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getMenorKm method, of class Vendedor.
     */
    @Test
    public void testGetMenorKm07() {
        System.out.println("getMenorKm07");
        Vendedor instance = new Vendedor("João da Silva");
        instance.addViagem(2,400,500.00);
        instance.addViagem(1,150,620.00);
        instance.addViagem(2,255,130.00);
        int expResult = 150;
        int result = instance.getMenorKm();
        assertEquals(expResult, result);
    }
    
}
