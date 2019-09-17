
import java.util.ArrayList;


/**
 *
 * @author marcel
 */
public class Vendedor {
    private String nome;
    private ArrayList<Viagem> viagens = new ArrayList();

    public Vendedor(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addViagem(int dias, int km, double valor){
        Viagem v = new Viagem(dias, km, valor);
        this.viagens.add(v);
    }
    
    public int getTotalKm(){
        int total = 0;
        
        for (Viagem v: this.viagens){
            total += v.getKm();
        }
        
        return total;
    }
    
    public double getValorASerPago(){
        int totalKm = this.getTotalKm();
        double valorKm = this.getValorKm(totalKm);
        return totalKm * valorKm;
    }

    private double getValorKm(int totalKm) {
        if (totalKm < 801){
            return 0.80;
        }
        if (totalKm < 1601){
            return 0.78;
        }
        return 0.75;
    }
    
    public double getTotalVendas(){
        double total = 0;
        for (Viagem v: this.viagens){
            total += v.getValorVendas();
        }
        return total;
    }
    
    public int getMenorKm(){
        int menor = Integer.MAX_VALUE;
        for (Viagem v: this.viagens){
            if (v.getKm() < menor){
                menor = v.getKm();
            }
        }
        return menor;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}
