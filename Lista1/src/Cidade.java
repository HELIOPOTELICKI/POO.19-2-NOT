
public class Cidade {
	// atributos
	private String nome;
	private String uf;
	private int populacaoMasculina, populacaoFeminina;
	private boolean calculado;

	// construtores
	public Cidade() {
	}

	public Cidade(String nome, int popMasc, int popFem) {
		this.setNome(nome);
		this.setPopulacaoMasculina(popMasc);
		this.setPopulacaoFeminina(popFem);
	}

	// métodos
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setPopulacaoMasculina(int valor) {
		this.populacaoMasculina = valor;
	}

	public void setPopulacaoFeminina(int valor) {
		this.populacaoFeminina = valor;
	}

	public void setCalculado(boolean valor) {
		this.calculado = valor;
	}

	public String getNome() {
		return this.nome;
	}

	public String getUf() {
		return this.uf;
	}

	public int getPopulacaoMasculina() {
		return this.populacaoMasculina;
	}

	public int getPopulacaoFeminina() {
		return this.populacaoFeminina;
	}

	public boolean isCalculado() {
		return this.calculado;
	}

}
