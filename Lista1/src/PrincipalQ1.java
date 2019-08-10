import java.util.Date;

public class PrincipalQ1 {

	public static void main(String[] args) {
		Pessoa p1;
		p1 = new Pessoa("João",'M',new Date());
		p1.setSexo('X');
		//p1.estadoCivil = "Casado";
		
		Pessoa p2 = new Pessoa("Maria",'F', new Date());
		//p2.nome = "Maria da Silva";
		//p2.sexo = 'X';
	}

}
