package model;

import java.time.LocalDate;

/**
 *
 * @author marcel
 */
public class AlunoEnsinoMedio extends Aluno {
    private byte ano;

    // construtor
	public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, byte ano) {
		super(nome, dataNascimento);
		this.setAno(ano);
	}

    // destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Apenas para demonstrar que passou pelo destrutor de AlunoEnsinoMedio: "+this.getNome());
		super.finalize();
	}

	public byte getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(byte ano) {
        if (ano < 1 || ano > 3)
            throw new IllegalArgumentException("Ano deve estar de 1 a 3");
        this.ano = ano;
    }

    public String mostra(){
    	// Carlos Pinheiro está cursando o 1o ano do ensino médio e tem 14 anos.
        return this.getNome()+" está cursando o "
               +this.getAno()+"o ano do ensino médio e tem"
               +this.getIdade()+" anos.";
    }


}

