import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author marcel
 */
public class Camara {
    private String cidade;
    private HashMap<Integer,Partido> partidos = new HashMap();

    public Camara(String cidade) {
        this.setCidade(cidade);
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void addPartido(Partido p){
        if (p == null){
            throw new IllegalArgumentException("Partido não pode ser nulo");
        }
        if (this.partidos.containsKey(p.getNumero())) {
        	throw new IllegalArgumentException("Já há partido com o número"+p.getNumero());
        }
        this.partidos.put(p.getNumero(),p);
    }
    
    public int getTotalProjApres(){
        int total = 0;
        for (Partido p:this.partidos.values()){
            total += p.getTotalProjApres();
        }
        return total;
    }

    public int getTotalProjAprov(){
        int total = 0;
        for (Partido p:this.partidos.values()){
            total += p.getTotalProjAprov();
        }
        return total;
    }

    public Vereador getVereadorMaisProjAprov(){
        Vereador verMaisProj = null;
        for (Partido p: this.partidos.values()){
            for (Vereador v: p.getListaVereadores()){
                if (verMaisProj == null // na primeira vez
                    || v.getQtdProjAprov()>verMaisProj.getQtdProjAprov()){
                    verMaisProj = v;
                }
            }
        }
        return verMaisProj;
    }
    
    public Vereador getVereadorMenorDesempenho(){
        Vereador verMenor = null;
        for (Partido p: this.partidos.values()){
            Vereador verPartido = p.getVereadorMenorDesempenho();
            if (verMenor == null
                || verPartido.getDesempenho() < verMenor.getDesempenho()){
                verMenor = verPartido;
            }
        }
        return verMenor;
    }
    
    public double getMediaDesempenho(){
        // calcular ponderado, pois a média geral de desempenho não é a média de desempenho dos partidos. Questão estatística.
        double soma = 0;
        int qtde = 0;
        
        for (Partido p: this.partidos.values()){
            soma += p.getMediaDesempenho()*p.getQtdeVereadores();
            qtde += p.getQtdeVereadores();
        }
        
        return (soma/qtde);
    }
    
    public List<Vereador> getVereadoresAcimaMedia(){
        double media = this.getMediaDesempenho();
        return this.getVereadoresDesempenhoAcima(media);
    }

    public List<Vereador> getVereadoresDesempenhoAcima(double linhaDeCorte){
        ArrayList<Vereador> lista = new ArrayList();
        for (Partido p: this.partidos.values()){
            for (Vereador v: p.getListaVereadores()){
                if (v.getDesempenho()>linhaDeCorte){
                    lista.add(v);
                }
            }
        }
        return lista;
    }    
    
    public Partido getPartido(int numero) {
        return this.partidos.get(numero);
    }
}
