package model;

import java.time.LocalDate;

/**
 *
 * @author marcel
 */
public class AlunoUniversitario extends Aluno{
	private char formaIngresso;
    private Curso curso;

    // construtor
    public AlunoUniversitario(String nome, LocalDate dataNascimento, char formaIngresso, Curso curso) {
		super(nome, dataNascimento);
		this.setFormaIngresso(formaIngresso);
		this.setCurso(curso);
	}
    
    // destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Apenas para demonstrar que passou pelo destrutor de AlunoUniversitario: "+this.getNome());
		super.finalize();
	}


	// métodos
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		if (curso == null) {
			throw new IllegalArgumentException("Curso não pode ser nulo. Identifique o curso do aluno");
		}
		this.curso = curso;
	}

	public String getFormaIngresso() {
		switch (this.formaIngresso) {
		case 'V': return "Vestibular";
		case 'E': return "ENEM";		
		case 'S': return "Seletivo especial";		
		case 'T': return "Transferência externa";
		case 'I': return "Transferência interna";
		default: return "Indeterminado";
		}
    }

    public void setFormaIngresso(char formaIngresso) {
    	String v = String.valueOf(formaIngresso);
        if ("VESTI".contains(v)) {
        	this.formaIngresso = formaIngresso;
        }
        else
        	throw new IllegalArgumentException("Forma de ingresso só pode ser V|E|S|T|I");
    }

    public String mostra() {
    	// Maria da Silva é aluno universitário do curso de BCC – Ciência da Computação, ingressando por vestibular.
        return this.getNome()+ " é aluno universitário do curso de "
               +this.getCurso().getSigla()+" - "+this.getCurso().getNome()
               + ", ingressando por "
               +this.getFormaIngresso()+".";
    }
}

