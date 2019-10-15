
import java.time.LocalDate;



/**
 *
 * @author marcel
 */
public class TelefoneResidencial extends Telefone {
    private boolean conexaoInternet;
    private final float VALOR_BASICO = 15;  // declaração de constante (final)
  
    @Override
    public String exibir(){
        return "Telefone Residencial "+this.getNumero()
                +" do cliente "+this.nomeUsuario // está acessível pois foi declarada como protected
                +(this.isConexaoInternet()?" sem ":" com ")+" conexão à Internet"
                +"\n instalado em "+this.getEndereco()
                +" com valor básico de R$"+this.getValorBasico();
    }
    
    public boolean isConexaoInternet() {
        return conexaoInternet;
    }

    public void setConexaoInternet(boolean conexaoInternet) {
        this.conexaoInternet = conexaoInternet;
    }

    @Override
    public float getValorBasico() {
        return VALOR_BASICO;
    }
    
    
}
