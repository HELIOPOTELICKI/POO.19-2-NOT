import java.time.LocalDate;

/**
 *
 * @author marcel
 */
public class TelefoneComercial extends Telefone{
    private String ramoAtividade;
    
    // atributo de classe
    private static LocalDate dataBase;

    // métodos de classe
    public static LocalDate getDataBase() {
        return dataBase;
    }

    public static void setDataBase(LocalDate dataBase) {
        TelefoneComercial.dataBase = dataBase;
    }

   
    // métodos    
    public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		if (ramoAtividade == null
			|| ramoAtividade.isEmpty()) {
			throw new IllegalArgumentException("Quantidade de ramais inválida");
		}
		this.ramoAtividade = ramoAtividade;
	}


    @Override
    public String exibir(){
        return "Telefone COMERCIAL "+this.getNumero()
                +" do cliente "+this.nomeUsuario // está acessível pois foi declarada como protected
                +" do ramo de atividade "+this.ramoAtividade
                +"\n instalado em "+this.getEndereco()
                +" com valor básico de R$"+this.getValorBasico();
    }    

    @Override
    public float getValorBasico() {
        if (TelefoneComercial.dataBase.isAfter(this.getDataInstalacao())){
            return 25;
        }
        else {
            return 37.50f;
        }
    }
}
