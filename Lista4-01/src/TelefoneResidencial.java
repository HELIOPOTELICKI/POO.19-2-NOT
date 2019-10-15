
import java.time.LocalDate;



/**
 *
 * @author marcel
 */
public class TelefoneResidencial extends Telefone {
    private boolean conexaoInternet;
    private final float VALOR_BASICO = 15;  // declara��o de constante (final)
  
    @Override
    public String exibir(){
        return "Telefone Residencial "+this.getNumero()
                +" do cliente "+this.nomeUsuario // est� acess�vel pois foi declarada como protected
                +(this.isConexaoInternet()?" sem ":" com ")+" conex�o � Internet"
                +"\n instalado em "+this.getEndereco()
                +" com valor b�sico de R$"+this.getValorBasico();
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
