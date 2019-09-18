
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcel
 */
class Partido {
    private String nome;
    private int numero;
    private ArrayList<Vereador> vereadores = new ArrayList();

    public Partido(String nome, int numero) {
        this.setNome(nome);
        this.setNumero(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null
            || nome.length() < 5){
            throw new IllegalArgumentException("Nome do partido inválido");
        }
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 10 || numero > 99){
            throw new IllegalArgumentException("Número inválido. Entre 10 e 99");
        }
        this.numero = numero;
    }
    
    public void addVereador(Vereador v){
        if (v == null){
            throw new IllegalArgumentException("Vereador não pode ser nulo");
        }
        this.vereadores.add(v);
        v.setPartido(this);
    }
    
    public int getTotalProjApres(){
        int total=0;
        for (Vereador v:this.vereadores){
            total += v.getQtdProjApres();
        }
        return total;
    }
    
    public int getTotalProjAprov(){
        int total=0;
        for (Vereador v:this.vereadores){
            total += v.getQtdProjAprov();
        }
        return total;
    }
    
    public double getMediaDesempenho(){
        double total=0;
        for (Vereador v:this.vereadores){
            total += v.getDesempenho();
        }
        return total/this.vereadores.size();
    }
    
    public List<Vereador> getListaVereadores(){
        return this.vereadores;
    }

    public Vereador getVereadorMenorDesempenho() {
        Vereador verRuim = null;
        for (Vereador v: this.vereadores){
            if (verRuim == null 
                || v.getDesempenho()<verRuim.getDesempenho()){
                verRuim = v;
            }
        }
        return verRuim;
    }
    
    public int getQtdeVereadores(){
        return this.vereadores.size();
    }
}
