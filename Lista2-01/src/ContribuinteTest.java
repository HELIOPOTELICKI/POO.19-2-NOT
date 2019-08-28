import static org.junit.Assert.*;

import org.junit.Test;

public class ContribuinteTest {

	@Test
	public void testSetUf() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRendaAnual() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalcularImposto01() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(3000);
		double resultado = c.calcularImposto();
		assertEquals(0,resultado,0.0009);
	}

	@Test
	public void testCalcularImposto02() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(9000);
		double resultado = c.calcularImposto();
		assertEquals(522,resultado,0.0009);
	}
	
	@Test
	public void testCalcularImposto03() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(10000);
		double resultado = c.calcularImposto();
		assertEquals(1500,resultado,0.0009);
	}
	
	@Test
	public void testCalcularImposto04() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911.73);
		double resultado = c.calcularImposto();
		assertEquals(9600.72,resultado,0.009);
	}
	
}
