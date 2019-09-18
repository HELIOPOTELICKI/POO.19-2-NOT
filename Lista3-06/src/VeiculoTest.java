

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcel
 */
public class VeiculoTest {
    
    public VeiculoTest() {
    }


    @Test
    public void testGetCustoMedio(){
        Veiculo v = new Veiculo();
        v.setPlaca("XXX-1111");
        v.setModelo("Caminhão VW Titan 2110");
        v.setDataAquis(LocalDate.now());
        
        Manutencao m1 = new Manutencao();
        m1.setCusto(623);
        m1.setTempo(1);
        v.addManutencao(m1);
        
        Manutencao m2 = new Manutencao();
        m2.setCusto(2134);
        m2.setTempo(3);
        v.addManutencao(m2);
        
        Manutencao m3 = new Manutencao();
        m3.setCusto(89);
        m3.setTempo(1);
        v.addManutencao(m3);
        
        assertEquals(948.66, v.getCustoMedio(),0.01);
    }
    
    /**
     * Test of getIndiceSucateamento method, of class Veiculo.
     */
    @Test
    public void testGetIndiceSucateamento() {
        System.out.println("getIndiceSucateamento");
        Veiculo v = new Veiculo();
        v.setPlaca("XXX-1111");
        v.setModelo("Caminhão VW Titan 2110");
        v.setDataAquis(LocalDate.of(2012, 3, 10));
        
        Manutencao m1 = new Manutencao();
        m1.setCusto(623);
        m1.setTempo(1);
        v.addManutencao(m1);
        
        Manutencao m2 = new Manutencao();
        m2.setCusto(2134);
        m2.setTempo(3);
        v.addManutencao(m2);
        
        Manutencao m3 = new Manutencao();
        m3.setCusto(89);
        m3.setTempo(1);
        v.addManutencao(m3);
        
        assertEquals(0, v.getIndiceSucateamento(),0);
    }

 }
