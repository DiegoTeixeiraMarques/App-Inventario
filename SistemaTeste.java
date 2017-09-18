package inventario;
import javax.swing.JOptionPane;

public class SistemaTeste {
	
	public static void main (String[] args) {
		
		JOptionPane.showMessageDialog(null, "ATENÇÃO! \n Você está prestes a iniciar um inventário. "
				+ "\n Antes disso, precisamos que informe o Grupo de produtos que será inventariado.");
		
		Grupo g1 = new Grupo();
		
		g1.cod = JOptionPane.showInputDialog("Digite o código do Grupo a ser inventariado \n Exemplos: 1, 2, 6608, 45.");
		g1.desc = JOptionPane.showInputDialog("Digite a descrição do Grupo \n Exemplos: Matéria Prima, Insumo, Estoque.");
		
		JOptionPane.showMessageDialog(null, "O Grupo é " + g1.desc + " e seu Código é " + g1.cod + "\nPrecione ENTER para prosseguir");
		
		JOptionPane.showMessageDialog(null, "Agora precisamos que cadastre os tipos de produtos contidos neste grupo." + 
				"\nExemplos: Caixas, elétrico, Hidráulico, Expediente, Limpeza" + "\n\nContudo, informe primeiro a quantidade e Tipos existentes.");
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de Tipos?"));
		JOptionPane.showMessageDialog(null,"A seguir, cadastre o código e a descrição de cada Tipo.");
		
		//variável para inicializar o loop com 1
		int i = 1; 
		
		// cadastra os tipos de produtos de acordo com a quantidade informada pelo usuário
		while(i <= qtd) { 
			
			Tipo novoTipo = new Tipo();
			
			novoTipo.cod = JOptionPane.showInputDialog("Tipo " + i + "\nQual o código?");
			novoTipo.desc = JOptionPane.showInputDialog("Tipo " + i + "\nQual a descrição?\nEx: Eletrico, Hidráulico, Caixas.");
			
		// adiciona o novo Tipo na Arraylist contida na classe Grupo
			g1.addTipo(novoTipo);
			
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "Tipos cadastrados com sucesso! Agora podemos iniciar o inventário.\n\n"
				+ "Precione ENTER para ir ao Menu.");
		
		boolean a = true;
		while (a) {
		//Criação do Menu para adicionar, listar e sair
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção no menu abaixo "
				+ "\n\n 1 - Adicionar produto "
				+ "\n\n 2 - Listar produtos "
				+ "\n\n 3 - Sair\n\n"));
		
		// adiconar produto
			if(opcao == 1) {
			
		// Cria um novo produto
				Produto produto = new Produto();
			
		// Solicita e atribui as informações do produto
				produto.cod = JOptionPane.showInputDialog("Qual o código do produto?");
				produto.desc = JOptionPane.showInputDialog("Qual a descrição do produto?");
				produto.grupo = g1;
				produto.qtd = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade do produto?"));
				produto.preco = Float.parseFloat(JOptionPane.showInputDialog("Qual o preco unitário do produto?"));
				//produto.data = JOptionPane.showInputDialog("Qual a data do cadastro?");	
			
				JOptionPane.showMessageDialog(null, "Na janela a seguir, aperte ENTER e indique, através do número antes da seta, "
					+ "qual o tipo do produto");
			
		// lista os tipos existentes
				g1.listarTipos(); 
			
		// recebe o a referência da ArrayList Tipos na qual será inserido o produto
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
	
		
		
		
	