import java.time.LocalDate;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private int qtdVotosFavoraveis;
	private String artigoLO;
	
	public ProjetoDeLeiComplementar(String titulo, LocalDate dataApresentacao, int qtdVotosFavoraveis,
			String artigoLO) {
		super(titulo, dataApresentacao);
		this.setQtdVotosFavoraveis(qtdVotosFavoraveis);
		this.setArtigoLO(artigoLO);
	}
	
	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}
	public void setQtdVotosFavoraveis(int qtdVotosFavoraveis) {
		if (qtdVotosFavoraveis < 0) {
			throw new IllegalArgumentException("Quantidade inválida de votos");
		}
		this.qtdVotosFavoraveis = qtdVotosFavoraveis;
	}
	public String getArtigoLO() {
		return artigoLO;
	}
	public void setArtigoLO(String artigoLO) {
		if (artigoLO == null || artigoLO.isEmpty()) {
			throw new IllegalArgumentException("Artigo da Lei Orgânica inválido");
		}
		this.artigoLO = artigoLO;
	}
	
	public String mostrar() {
		return "Complementar " + super.mostrar()
				+ "\nArtigo da Lei Orgânica:" + this.artigoLO
				+(this.isAprovado()?"\nVotos favoráveis: "+this.qtdVotosFavoraveis:"");
	}

}
