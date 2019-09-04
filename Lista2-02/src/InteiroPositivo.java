
public class InteiroPositivo {
	private int x;

	// item a)
	public void setValor(int valor) {
		if (valor >= 0) {
			this.x = valor;
		}
	}

	// item b)
	public int multiplicar(InteiroPositivo outro) {
		return this.x * outro.getValor();
	}

	public int getValor() {
		return this.x;
	}

	// item c)
	public long fatorial() {
		long fat = 1;

		for (int valor = this.x; valor > 0; valor--) {
			fat = fat * valor;
		}

		return fat;
	}

	// item d)
	public String divisoresInteiros() {
		String str = "Os divisores são ";
		int qtd = 0;
		for (int divisor = 1; divisor <= this.x; divisor++) {
			if (this.x % divisor == 0) {
				str = str + divisor + ", ";
				qtd++;
			}
		}
		str = str + " e a quantidade de divisores é "+qtd;
		return str;
	}
	
	// item e)
	public int[] fibonacci() {
		int[] vetor = new int[this.x];
		if (this.x > 0) {
			vetor[0]= 1;
			if (this.x > 1) {
				vetor[1]= 1;
			}
		}
		for (int i = 2; i < this.x ; i++) {
			vetor[i] = vetor[i-2]+vetor[i-1];
		}
		return vetor;
	}
	
	// item f)
	public double valorH() {
		double h = 0;
		for (int d=1; d <= this.x; d++) {
			h = h + 1.0/d;
		}
		return h;
	}
}
