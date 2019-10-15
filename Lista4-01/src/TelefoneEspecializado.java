import java.time.LocalDate;

public class TelefoneEspecializado extends Telefone {
	private int qtdOcorrencias;
	
	// m�todos
	public int getQtdOcorrencias() {
		return qtdOcorrencias;
	}

	public void setQtdOcorrencias(int qtdOcorrencias) {
		if (qtdOcorrencias < 1) {
			throw new IllegalArgumentException("Quantidade de ocorr�ncias deve ser ao menos 1");
		}
		this.qtdOcorrencias = qtdOcorrencias;
	}

	@Override
	public float getValorBasico() {
		if (this.qtdOcorrencias < 1001)
			return 50;
		if (this.qtdOcorrencias < 5001)
			return 67.80f;
		if (this.qtdOcorrencias < 10001)
			return 98.50f;
		if (this.qtdOcorrencias < 50001)
			return 123.90f;	
		return 187.82f;
	}

	@Override
    public String exibir(){
        return "Telefone ESPECIALIZADO "+this.getNumero()
                +" do cliente "+this.nomeUsuario // est� acess�vel pois foi declarada como protected
                +"\n instalado em "+this.getEndereco()
                +" com valor b�sico de R$"+this.getValorBasico()
        		+"\n com "+this.qtdOcorrencias+" ocorr�ncias contratadas";
    }    	
	
}
