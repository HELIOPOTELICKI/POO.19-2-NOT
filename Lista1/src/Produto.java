
public class Produto {
	// atributos
	  private String nome;
	  private String descricao;
	  private float precoUnitario;
	  private int desconto;

	  // construtor
	  public Produto(String nome,  String desc, 
			 float preco, int desconto){
		this.setNome(nome);
		this.setDescricao(desc);
		this.setPrecoUnitario(preco);
		this.setDesconto(desconto);
	  }

	  // construtor padrão
	  public Produto(){
	  }

	  // métodos
		public String getNome(){
			return this.nome;
		}

		public String getDescricao(){
			return this.descricao;
		}

		public float getPrecoUnitario(){
			return this.precoUnitario;
		}

		public int getDesconto(){
			return this.desconto;
		}

		public void setNome(String nome){
			this.nome = nome;
		}

		public void setDescricao(String descricao){
			this.descricao = descricao;
		}

		public void setPrecoUnitario(float preco){
			this.precoUnitario = preco;
		}

		public void setDesconto(int desconto){
			this.desconto = desconto;
	}
}
