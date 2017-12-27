package livpoliarray;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Atributos ###################################################################################
		Livro liv1 = new Livro("Inferno","Ação",10,79.9f,9.45f, "Dan Brow", "Arqueiro","7ª");
		Cd cd1 = new Cd("Cd Coletania 2017","Raiz",10 , 12.34f,9.45f,"Diversos","Sony","Brasil");
		Dvd dvd1 = new Dvd ("Poeira em Alto Mar","Ação",20,23.35f,9.45f,"Diretor do Filme","2:10:30","Livre");
		
		GerenciadorEstoque controle = new GerenciadorEstoque();
		
		
		int op, op1;
		//float dolar;
		
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("Principal\nDigite a opção desejada :"
					+ "\n1 - Livros"
					+ "\n2 - Cds"
					+ "\n3 - Dvds"		
					+ "\n0 - Sair"));
			switch(op){	
			case 1:
				do{
					op1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada para Livros:"
							+ "\n1 - Comprar"
							+ "\n2 - Vender"
							+ "\n3 - Listar"
							+ "\n4 - Encomendar"
							+ "\n5 - Criar Lista"
							+ "\n0 - Voltar ao Menu Anterior"));
					switch(op1){	
					case 1:
						controle.Comprar(liv1);
						break;
					case 2:
						controle.Vender(liv1);
						break;
					case 3:
						liv1.listarProduto();
						break;
					case 4:
						controle.Encomendar(liv1);
						break;
					case 5:
						Produto prod [] = new Produto[3];
						prod[0] = liv1;
						prod[1] = cd1;
						prod[2] = dvd1;
						controle.CriarLista();
						break;
					case 0:
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção Invalida!");
					break;
					}
					
				}while(op1!=0);
				break;
			case 2:
				do{
					op1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada para Cds:"
							+ "\n1 - Comprar"
							+ "\n2 - Vender"
							+ "\n3 - Listar"
							+ "\n4 - Encomendar"
							+ "\n5 - Criar Lista"
							+ "\n0 - Voltar ao Menu Anterior"));
					switch(op1){	
					case 1:
						controle.Comprar(cd1);
						break;
					case 2:
						controle.Vender(cd1);
						break;
					case 3:
						cd1.listarProduto();
						break;
					case 4:
						controle.Encomendar(cd1);
						break;
					case 5:
						Produto prod [] = new Produto[3];
						prod[0] = liv1;
						prod[1] = cd1;
						prod[2] = dvd1;
						controle.CriarLista();
						break;
					case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Invalida!");
					break;
					}
					
				}while(op1!=0);
				break;
			case 3:
				do{
					op1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada para Dvds:"
							+ "\n1 - Comprar"
							+ "\n2 - Vender"
							+ "\n3 - Listar"
							+ "\n4 - Encomendar"
							+ "\n5 - Criar Lista"
							+ "\n0 - Voltar ao Menu Anterior"));
					switch(op1){	
					case 1:
						controle.Comprar(dvd1);
						break;
					case 2:
						controle.Vender(dvd1);
						break;
					case 3:
						dvd1.listarProduto();
						break;
					case 4:
						controle.Encomendar(dvd1);
						break;
					case 5:
						Produto prod [] = new Produto[3];
						prod[0] = liv1;
						prod[1] = cd1;
						prod[2] = dvd1;
						controle.CriarLista();
						break;
					case 0:
						break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Invalida!");
					break;
					}
				}while(op1!=0);
				break;				
			}
		}while(op!=0);
	}

}
