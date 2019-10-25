import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProjetoDeLei {
	private String titulo;
	private LocalDate dataApresentacao;
	private LocalDate dataAprovacao;
	private int numeroProjeto;
	
	private static int contadorProjetos = 0;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public ProjetoDeLei(String titulo, LocalDate dataApresentacao) {
		this.setTitulo(titulo);
		this.setDataApresentacao(dataApresentacao);
		this.numeroProjeto = ++contadorProjetos;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("Título do projeto inválido");
		}
		this.titulo = titulo;
	}
	
	public LocalDate getDataApresentacao() {
		return dataApresentacao;
	}
	public void setDataApresentacao(LocalDate dataApresentacao) {
		if (dataApresentacao == null) {
			throw new IllegalArgumentException("Data de apresentação inválida");
		}
		this.dataApresentacao = dataApresentacao;
	}
	
	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(LocalDate dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}
	
	public int getNumeroProjeto() {
		return numeroProjeto;
	}

	public boolean isAprovado() {
		return (this.dataAprovacao != null);
	}
	
	public String mostrar() {
		return "Projeto de Lei "+this.numeroProjeto + " - "+this.titulo
				+"\napresentado em "+this.dataApresentacao.format(formatter)
				+(this.isAprovado()?"\naprovado em "+this.dataAprovacao.format(formatter):"\n ainda não aprovado");
	}

}
