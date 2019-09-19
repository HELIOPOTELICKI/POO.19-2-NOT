//  implementação dos casos de teste do Exercício 12
import org.junit.Test;
import static org.junit.Assert.*;

public class VetorDeReaisTest {
	@Test
	public void casoDeTeste01() {
		VetorDeReais vra = new VetorDeReais(3);
		vra.setValor(2, 0);
		vra.setValor(-1, 1);
		vra.setValor(3.5, 2);
		
		VetorDeReais vrb = new VetorDeReais(1);
		vrb.setValor(3, 0);
		
		assertNull(vra.dividir(vrb));
	}
	
	
	// uma forma de implementar o caso de teste 2
	@Test
	public void casoDeTeste02() {
		VetorDeReais vetor = new VetorDeReais(3);
		vetor.setValor(2,0);
		vetor.setValor(-1,1);
		vetor.setValor(3.5,2);
		VetorDeReais vetor2 = new VetorDeReais(3);
		vetor2.setValor(3,0);
		vetor2.setValor(2,1);
		vetor2.setValor(1,2);
		VetorDeReais vetor3 = new VetorDeReais(3);
		vetor3.setValor(0.6666666666666666,0);
		vetor3.setValor(-0.5,1);
		vetor3.setValor(3.5,2);
		VetorDeReais x = vetor.dividir(vetor2);
		assertEquals(vetor3.exibir(), x.exibir());
	}
	
	// segunda forma de implementar o caso de teste 2
    @Test
    public void casoDeTeste02b() {
        VetorDeReais teste1 = new VetorDeReais(3);
        teste1.setValor(2, 0);
        teste1.setValor(-1, 1);
        teste1.setValor(3.5, 2);
        
        VetorDeReais teste2 = new VetorDeReais(3);
        teste2.setValor(3, 0);
        teste2.setValor(2, 1);
        teste2.setValor(1, 2);
        
        VetorDeReais resultadoEsperado = new VetorDeReais(3);
        resultadoEsperado.setValor(0.666666, 0);
        resultadoEsperado.setValor(-0.5, 1);
        resultadoEsperado.setValor(3.5, 2);
        double delta = 0.0000009;
        
        //Act
        VetorDeReais resultado = teste1.dividir(teste2);
        
        //Assert
        for (int i = 0; i < resultadoEsperado.getTamanho(); i++) {
            assertEquals(resultadoEsperado.getValor(i), resultado.getValor(i), delta);
        }
    }	
	
	// terceira forma de implementar o caso de teste 2
    @Test
	public void casoDeTeste02c() {
		VetorDeReais vetorReais = new VetorDeReais(3);
		vetorReais.setValor(2, 0);
		vetorReais.setValor(-1, 1);
		vetorReais.setValor(3.5, 2);
		
		VetorDeReais vetor2 = new VetorDeReais(3);
		vetor2.setValor(3, 0);
		vetor2.setValor(2, 1);
		vetor2.setValor(1, 2);
		
		VetorDeReais div = vetorReais.dividir(vetor2);
		
		double[] arrayExp = {0.666666, -0.5 , 3.5 };
		
		double[] arrayDiv = {div.getValor(0), div.getValor(1), div.getValor(2)};
		
		assertArrayEquals(arrayExp, arrayDiv, 0.0000009);
	}
}
