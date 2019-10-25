package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author marcel
 */
public abstract class Aluno implements Comparable<Aluno>{
    private String nome;
    private LocalDate dataNascimento;

    // construtor
    public Aluno(String nome, LocalDate dataNascimento) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
	}

    // destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Apenas para demonstrar que passou pelo destrutor de ALUNO: "+this.getNome());
		super.finalize();
	}  
    
    // métodos
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null ||
            nome.isEmpty())
            throw new IllegalArgumentException("Nome do aluno inválido");
        this.nome = nome;
    }

    public int getIdade() {
    	Period periodo = Period.between(this.dataNascimento, LocalDate.now());
		return periodo.getYears();
    }

    public abstract String mostra();

	@Override
	public int compareTo(Aluno outro) {
		return this.getNome().compareTo(outro.getNome());
	}

}

