package inventario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tipo extends Grupo {
	
	//String cod; //atributo herdado
	//String desc; //atributo herdado
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();

	
	public void add(Produto produto) {
		
		produtos.add(produto);
		
		JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!\n\n"
				+ "PRODUTO" + "   " + "DESCRIÇÃO" + "     " + "QUANTIDADE" + "\n\n"
				+ "----------------------------------------------------------------\n\n"
				+ produto.cod + "        " + produto.desc + "        " + produto.qtd );
		
	}
	
	public void listarProdutos() {
		
		String lista = "";
		
		for(int i = 0; i < produtos.size(); i++) {
			Produto p = produtos.get(i);
			lista += i + "  =>  " + p.cod + "   " + p.desc + "   " + p.qtd + "   " + p.preco + "   " + "\n\n";
			
		}
		
		JOptionPane.showMessageDialog(null, lista);
		
	}
	
	
	/*public void remover(Object produto) {
		
		produtos.remove(produto);
		
	}
	
	public void alterar(Object produto) {
		
		
		
	}*/
	

}
