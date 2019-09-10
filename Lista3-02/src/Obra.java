
/**
 *
 * @author marcel
 */
public class Obra {
    private String titulo;
    private String autor;
    private Parecer[] pareceres = new Parecer[3];  // permite agregar objetos de Parecer em Obra
    private byte indice = 0;
    
    // método para colocar um objeto de Parecer no vetor do objeto de Obra (agregar)
    public void addParecer(Parecer p){
        if (this.indice < this.pareceres.length) {
            this.pareceres[this.indice] = p;
            this.indice++;
        }
    }
    
    public byte getQtdePareceres(){
        return this.indice;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null
            && titulo.length()>2){
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String exibir() {
    	String retorno = "Obra: "+this.getTitulo()
        +"\nAutor: "+this.getAutor()
        +"\nPareceres:";
    	for (int i=0; i < this.indice; i++) {
    		retorno += "\n"+this.pareceres[i].exibir();
    	}
    	return retorno;
    }
    
}
