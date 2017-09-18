package inventario;
import java.util.*;
import javax.swing.JOptionPane;

public class Grupo {
	String cod;
	String desc;
	ArrayList <Tipo> tipos = new ArrayList<Tipo>();
	
	public void listarTipos() {
	
		String lista = "";
		
		for(int i = 0; i < tipos.size(); i++) {
			Tipo t = tipos.get(i);
			lista += i + "  =>  " + t.cod + "   " + t.desc + "\n\n";
			
		}
		
		JOptionPane.showMessageDialog(null, lista);
		
	}
	
	public void addTipo(Tipo novoTipo) {
		
		tipos.add(novoTipo);
		
	}
	
	public void addProduto(int index, Produto element) {
		
		tipos.get(index).add(element);
		
	}
	
	public void listarProdutos(int index) {
		
		//for(index = 0; index < tipos.size(); index++) {
			
		tipos.get(index).listarProdutos();
		
		//}
	
	/*public void alterarProduto(int index) {
		Object produto = JOptionPane.showInputDialog("Qual o código do produto?");
		tipos.get(index).alterar(produto);
		
	}
	
	public void excluirProduto(int index) {
		
		Object produto = JOptionPane.showInputDialog("Qual o código do produto?");
		tipos.get(index).remover(produto);
		
	}*/
		
	}
}
