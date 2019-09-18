

/**
 *
 * @author marcel
 */
public class Vereador {
    private String nome;
    private Partido partido;
    private int qtdProjAprov,
                qtdProjApres;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null
            || nome.length()<2){
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
        return qtdProjAprov;
    }

    public void setQtdProjAprov(int qtdProjAprov) {
        if (qtdProjAprov < 0){
            throw new IllegalArgumentException("Quantidade de projetos aprovados não pode ser menor que zero.");
        }
        this.qtdProjAprov = qtdProjAprov;
    }

    public int getQtdProjApres() {
        return qtdProjApres;
    }

    public void setQtdProjApres(int qtdProjApres) {
        if (qtdProjApres < 0){
            throw new IllegalArgumentException("Quantidade de projetos apresentados não pode ser menor que zero.");
        }        
        this.qtdProjApres = qtdProjApres;
    }
    
    public double getIndiceTrabalho(){
        if (this.qtdProjApres > 17){
            return 1.22;
        }
        if (this.qtdProjApres > 10){
            return 1.08;
        }
        if (this.qtdProjApres > 5){
            return 1;
        }    
        if (this.qtdProjApres > 0){
            return 0.8;
        }        
        return 0;
    }
    
    public double getDesempenho(){
        return ((double)this.qtdProjAprov / this.qtdProjApres)*this.getIndiceTrabalho();
    }
    
}
