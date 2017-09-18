package inventario;

public class Produto {
	String cod;
	String desc;
	Grupo grupo;
	int qtd;
	float preco;
	
	public Produto() {
		
	}
	
	public Produto(Grupo grupo) {
		
		this.grupo = grupo;
		
	}

}
