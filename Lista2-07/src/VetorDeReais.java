import java.util.Arrays;

public class VetorDeReais {
	private double[] vetor;
	
	public VetorDeReais(int tamanho) {
		this.vetor = new double[tamanho];
	}
	
	// item a)
	public void setValor(double valor, int pos) {
		this.vetor[pos] = valor;
	}
	
	public double getValor(int pos) {
		return this.vetor[pos];
	}
	
	// item b)
	public int getQtdPares() {
		int total = 0;
		for (int i=0; i < this.vetor.length; i++) {
			if ((int)this.vetor[i] % 2 == 0) {
				total++;
			}
		}
		return total;
	}
	
	// item c)
	public VetorDeReais dividir(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return null;  // null indica que não será feita a operação
		}
		VetorDeReais novo = new VetorDeReais(this.getTamanho());
		double temp;
		for (int i=0; i < this.getTamanho(); i++) {
			temp =  this.getValor(i) / outro.getValor(i);
			novo.setValor(temp,i);
		}
		return novo;
	}
	
	// item d)
	public double multiplicar(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return Double.MIN_VALUE;  // MIN_VALUE indica que não será feita a operação
		}
		double m = 0;
		double temp;
		
		for (int i=0, j = this.getTamanho()-1;
				 i < this.getTamanho(); 
				 i++, j--) {
			temp = this.getValor(i) * outro.getValor(j);
			m += temp;
		}
		return m;
	}
	
	public int getTamanho() {
		return this.vetor.length;
	}
	
	// item e)
	public void inverter() {
		double aux;
		for (int i = 0; i < this.getTamanho()/2; i++) {
			aux = this.vetor[i];
			this.vetor[i] = this.vetor[this.vetor.length-1-i];
			this.vetor[this.vetor.length-1-i] = aux;
		}
	}
	
	// item f)
	public double getMaiorDiferenca() {
		double maior = Double.MIN_VALUE;
		double dif;
		for (int i=0; i < this.getTamanho()-1; i++) {
			dif = Math.abs(this.vetor[i] - this.vetor[i+1]);
			if (dif > maior) {
				maior = dif;
			}
		}
		return maior;
	}
	
	public String exibir() {
		return Arrays.toString(this.vetor);
	}
}
