// implementa��o dos casos de teste do Exerc�cio 11

import org.junit.Test;

import static org.junit.Assert.*;

public class InteiroPositivoTest {
	@Test
	public void testeFatorial1() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(10);
		assertEquals(3628800,ip.fatorial());
	}
	
	@Test
	public void testeFatorial2() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(20);
		assertEquals(2432902008176640000L , ip.fatorial());
	}
	
	@Test
	public void testDivisorInteiro1() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(14);
		assertEquals("Os divisores s�o 1, 2, 7, 14,  e a quantidade de divisores � 4", ip.divisoresInteiros());
	}
	
	@Test
	public void testDivisorInteiro2() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(18);
		assertEquals("Os divisores s�o 1, 2, 3, 6, 9, 18,  e a quantidade de divisores � 6", ip.divisoresInteiros());
	}
	
	@Test
	public void testFibonacci1() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(9);
		int[] esperado = { 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		assertArrayEquals(esperado, ip.fibonacci());
	}
	
	@Test
	public void testFibonacci2() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(15);
		int[] esperado = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		assertArrayEquals(esperado, ip.fibonacci());
	}
}
