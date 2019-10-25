import java.util.ArrayList;

/**
 *
 * @author marcel
 */
public class Vereador {
	private String nome;
	private Partido partido;
	private ArrayList<ProjetoDeLei> projetos = new ArrayList();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.length() < 2) {
			throw new IllegalArgumentException("Nome do vereador inválido. Ao menos 2 caracteres");
		}
		this.nome = nome;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public int getQtdProjAprov() {
		int total = 0;
		for (ProjetoDeLei p : this.projetos) {
			if (p.isAprovado()) {
				total++;
			}
		}
		return total;
	}

	public int getQtdProjApres() {
		return this.projetos.size();
	}

	public void addProjeto(ProjetoDeLei novo) {
		if (novo == null) {
			throw new IllegalArgumentException("Projeto inválido. Não pode ser nulo.");
		}
		this.projetos.add(novo);
	}

	public double getIndiceTrabalho() {
		if (this.getQtdProjApres() > 17) {
			return 1.22;
		}
		if (this.getQtdProjApres() > 10) {
			return 1.08;
		}
		if (this.getQtdProjApres() > 5) {
			return 1;
		}
		if (this.getQtdProjApres() > 0) {
			return 0.8;
		}
		return 0;
	}

	public double getDesempenho() {
		if (this.getQtdProjApres() > 0) {
			return ((double) this.getQtdProjAprov() / this.getQtdProjApres()) * this.getIndiceTrabalho();
		} else {
			return 0;
		}
	}

	public String exibir() {
		String str = "Vereador "+this.getNome()
					+" do partido "+partido.getNome()
					+"\nProjetos: ";
		for (ProjetoDeLei p: this.projetos) {
			str += "\n"+p.mostrar();
		}
		return str;
	}

}
