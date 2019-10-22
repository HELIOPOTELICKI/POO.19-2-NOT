package model;

public class Curso {
	private String sigla;
	private String nome;

	public Curso(String sigla, String nome) {
		this.setSigla(sigla);
		this.setNome(nome);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		if (sigla == null || sigla.length() != 3) {
			throw new IllegalArgumentException("Sigla do curso inválida");
		} else {
			this.sigla = sigla;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome do curso inválido");
		} else {
			this.nome = nome;
		}
	}
}
