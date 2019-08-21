
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
		str = str + " e quantidade de divisores é "+qtd;
		return str;
	}
}
