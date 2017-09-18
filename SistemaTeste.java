package inventario;
import javax.swing.JOptionPane;

public class SistemaTeste {
	
	public static void main (String[] args) {
		
		JOptionPane.showMessageDialog(null, "ATEN��O! \n Voc� est� prestes a iniciar um invent�rio. "
				+ "\n Antes disso, precisamos que informe o Grupo de produtos que ser� inventariado.");
		
		Grupo g1 = new Grupo();
		
		g1.cod = JOptionPane.showInputDialog("Digite o c�digo do Grupo a ser inventariado \n Exemplos: 1, 2, 6608, 45.");
		g1.desc = JOptionPane.showInputDialog("Digite a descri��o do Grupo \n Exemplos: Mat�ria Prima, Insumo, Estoque.");
		
		JOptionPane.showMessageDialog(null, "O Grupo � " + g1.desc + " e seu C�digo � " + g1.cod + "\nPrecione ENTER para prosseguir");
		
		JOptionPane.showMessageDialog(null, "Agora precisamos que cadastre os tipos de produtos contidos neste grupo." + 
				"\nExemplos: Caixas, el�trico, Hidr�ulico, Expediente, Limpeza" + "\n\nContudo, informe primeiro a quantidade e Tipos existentes.");
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de Tipos?"));
		JOptionPane.showMessageDialog(null,"A seguir, cadastre o c�digo e a descri��o de cada Tipo.");
		
		//vari�vel para inicializar o loop com 1
		int i = 1; 
		
		// cadastra os tipos de produtos de acordo com a quantidade informada pelo usu�rio
		while(i <= qtd) { 
			
			Tipo novoTipo = new Tipo();
			
			novoTipo.cod = JOptionPane.showInputDialog("Tipo " + i + "\nQual o c�digo?");
			novoTipo.desc = JOptionPane.showInputDialog("Tipo " + i + "\nQual a descri��o?\nEx: Eletrico, Hidr�ulico, Caixas.");
			
		// adiciona o novo Tipo na Arraylist contida na classe Grupo
			g1.addTipo(novoTipo);
			
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "Tipos cadastrados com sucesso! Agora podemos iniciar o invent�rio.\n\n"
				+ "Precione ENTER para ir ao Menu.");
		
		boolean a = true;
		while (a) {
		//Cria��o do Menu para adicionar, listar e sair
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma op��o no menu abaixo "
				+ "\n\n 1 - Adicionar produto "
				+ "\n\n 2 - Listar produtos "
				+ "\n\n 3 - Sair\n\n"));
		
		// adiconar produto
			if(opcao == 1) {
			
		// Cria um novo produto
				Produto produto = new Produto();
			
		// Solicita e atribui as informa��es do produto
				produto.cod = JOptionPane.showInputDialog("Qual o c�digo do produto?");
				produto.desc = JOptionPane.showInputDialog("Qual a descri��o do produto?");
				produto.grupo = g1;
				produto.qtd = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade do produto?"));
				produto.preco = Float.parseFloat(JOptionPane.showInputDialog("Qual o preco unit�rio do produto?"));
				//produto.data = JOptionPane.showInputDialog("Qual a data do cadastro?");	
			
				JOptionPane.showMessageDialog(null, "Na janela a seguir, aperte ENTER e indique, atrav�s do n�mero antes da seta, "
					+ "qual o tipo do produto");
			
		// lista os tipos existentes
				g1.listarTipos(); 
			
		// recebe o a refer�ncia da ArrayList Tipos na qual ser� inserido o produto
				int tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo?"));
			
		// adiciona o produto
				g1.addProduto(tipo, produto);
			
			} else {
		
		//listar produtos
					if (opcao == 2) {
				
					g1.listarTipos(); 
					int tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo que deseja listar?"));
				
					g1.listarProdutos(tipo);
				
		
					} 
					
					else {
		//sair do programa
					if (opcao == 3) {
			
						a = false;
		
					}
				}
			}	
		}
	}
}	
	
		
		
		
	