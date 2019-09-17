
/**
 *
 * @author marcel
 */
public class Viagem {
    private int duracao;
    private int km;
    private double valorVendas;

    public Viagem(int duracao, int km, double valorVendas) {
        this.setDuracao(duracao);
        this.setKm(km);
        this.setValorVendas(valorVendas);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao < 1 || duracao > 31){
            throw new IllegalArgumentException("Duração em dias deve estar entre 1 e 31");
        }
        this.duracao = duracao;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        if (km < 0){
            throw new IllegalArgumentException("Quilometragem inválida");
        }
        this.km = km;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0){
            throw new IllegalArgumentException("Valor de vendas inválido");
        }
        this.valorVendas = valorVendas;
    }
    
    
    
}
