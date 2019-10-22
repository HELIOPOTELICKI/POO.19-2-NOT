
import java.time.LocalDate;



/**
 *
 * @author marcel
 */
public abstract class Telefone {
    protected String nomeUsuario;  // para exemplificar a diferença entre protected e private
    private String numero;
    private String endereco;
    private LocalDate dataInstalacao;


    public abstract float getValorBasico();
    public abstract String exibir();
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        if (nomeUsuario == null
            || nomeUsuario.length()<5){
            throw new IllegalArgumentException("Nome do usuário inválido");
        }
        this.nomeUsuario = nomeUsuario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
    	System.out.println(numero);
        if (numero == null
        		|| numero.length()!=10){  
            throw new IllegalArgumentException("Número do telefone inválido - não contém 10 dígitos");
        }
        try {
        	// outro forma de testar se a String tem 10 dígitos: numero.matches("[0-9]{10}")
        	Long.parseLong(numero);  // para verificar se todos os caracteres são dígitos
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Número do telefone inválido - não contém 10 dígitos");        	
        }
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(LocalDate dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }
    
    
}
