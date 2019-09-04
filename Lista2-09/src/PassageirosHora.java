
public class PassageirosHora {
	private int[][][] matriz = new int[12][30][24]; // 12 meses x 30 dias x 24 horas
	
	// item a
	public void adiciona(int dia, int mes, int hora) {
		// -1 para adaptar do valor natural para o índice da matriz
		matriz[mes-1][dia-1][hora]++;
	}
	
	// item b
	public int quantosPassageiros(int dia, int mes) {
		int total = 0;
		mes--;  // ajustar do natural para o índice
		dia--;
		for (int h=0; h < 24; h++) {
			total += matriz[mes][dia][h];
		}
		return total;
	}
	
	// item c
	public int quantosPassageiros(int mes) {
		int total = 0;
		for (int dia=1; dia <=30; dia++) {
			total += this.quantosPassageiros(dia, mes);
		}
		return total;
	}
	
	public int mesMenorFluxo() {
		int mesMenor=0;
		int qtdMenor = Integer.MAX_VALUE;
		for (int mes=1; mes<=12; mes++) {
			int aux = this.quantosPassageiros(mes);
			if (aux < qtdMenor) {
				mesMenor = mes;
				qtdMenor = aux;
			}
		}
		return mesMenor;
	}
	
	// item d
	public int[] picoTransporte() {
		int diaMaior, mesMaior, horaMaior, qtdMaior;
		diaMaior = mesMaior = horaMaior = qtdMaior = 0;
		for (int m=0; m < 12; m++) {  
			for (int d=0; d < 30; d++) {
				for (int h=0; h < 24; h++) {
					if (matriz[m][d][h] > qtdMaior) {
						qtdMaior = matriz[m][d][h];
						diaMaior = d+1;
						mesMaior = m+1;
						horaMaior = h;
					}
				}
			}
		}
		int[] retorno = {diaMaior, mesMaior, horaMaior, qtdMaior};
		return retorno;
	}
}
