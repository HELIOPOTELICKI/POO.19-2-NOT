import java.util.Date;

public class Pessoa {
	private String nome;
	private char sexo;
	private Date dataNascimento;
	private String estadoCivil = "Solteiro";  // 1a forma de inicializar
	
	public Pessoa(String nome, char sexo, Date data) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setDataNascimento(data);
		this.setEstadoCivil("Solteiro");  //2a forma
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo == 'M'  || sexo == 'F') {
			this.sexo = sexo;
		}
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}
