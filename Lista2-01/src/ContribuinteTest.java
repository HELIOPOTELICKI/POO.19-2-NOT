import static org.junit.Assert.*;

import org.junit.Test;

public class ContribuinteTest {

	@Test
	public void testSetUf06() {
		Contribuinte c = new Contribuinte();
		String uf = "SC";
		c.setUf(uf);
		assertEquals(uf,c.getUf());
	}
	
	@Test
	public void testSetUf07() {
		Contribuinte c = new Contribuinte();
		String uf = "PR";
		c.setUf(uf);
		assertEquals(uf,c.getUf());
	}
	
	@Test
	public void testSetUf08() {
		Contribuinte c = new Contribuinte();
		String uf = "RS";
		c.setUf(uf);
		assertEquals(uf,c.getUf());
	}
	
	@Test
	public void testSetUf09() {
		Contribuinte c = new Contribuinte();
		String uf = "SC";
		c.setUf(uf);
		c.setUf("RJ");
		assertEquals(uf,c.getUf());
	}	
	
	@Test
	public void testSetUf10() {
		Contribuinte c = new Contribuinte();
		String uf = "SC";
		c.setUf(uf);
		c.setUf("SP");
		assertEquals(uf,c.getUf());
	}	

	@Test
	public void testSetRendaAnual05() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(10000);
		c.setRendaAnual(-818.50);
		assertEquals(10000, c.getRendaAnual(),0);
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
