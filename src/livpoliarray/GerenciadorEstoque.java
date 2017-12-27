package livpoliarray;

import javax.swing.JOptionPane;

public class GerenciadorEstoque {
	private double tot;
	public GerenciadorEstoque(){
		this(0d);
	}
	
	public GerenciadorEstoque(double tot){
		this.tot = tot;
	}
	
	public double getTot(){
		return this.tot;
	}
	
	public void setTot(double tot){
		this.tot = tot;
	}
	/**
	 * 
	 * @param prod
	 */
	public void Comprar(Produto prod){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,	"Digite a quantidade comprada: "));
			
		JOptionPane.showMessageDialog(null,	"Estoque anterior de " + prod.getClass().getSimpleName() + " : " + prod.getEstoqueDisponivel() +
				"\nQuantidade comprada: "+ quantidade + 
				"\nQuantidade Atual: "+ (prod.getEstoqueDisponivel()+quantidade));
		
		prod.setEstoqueDisponivel(prod.getEstoqueDisponivel()+quantidade);
	}
	
	/**
	 * 
	 * @param prod
	 */
	public void Vender(Produto prod){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,	"Digite a quantidade vendida: "));
		
		
		JOptionPane.showMessageDialog(null,"Estoque anterior de " + prod.getClass().getSimpleName() + " : " + prod.getEstoqueDisponivel() + 
				"\nQuantidade vendida: " + quantidade + "\nQuantidade Atual: " + (prod.getEstoqueDisponivel()-quantidade));
		
		prod.setEstoqueDisponivel(prod.getEstoqueDisponivel()-quantidade);
	}
	
	/**
	 * 
	 * @param prod
	 */
	public void Encomendar(Produto prod){
		
		int qtde = Integer.parseInt(JOptionPane.showInputDialog(null,	"Digite a quantidade de: "));
		if(qtde <=prod.getEstoqueDisponivel()){
			JOptionPane.showMessageDialog(null, 
					"Encomenda do " + prod.getClass().getSimpleName() + " - " +
					prod.getDescricao() + " realizada com pronta entrega");
		} else {
			JOptionPane.showMessageDialog(null, 
					"Encomenda do " + prod.getClass().getSimpleName() + " - " +
					prod.getDescricao() + " realizado pedido");
		}
		
	}
	
	public void Totalizador(Produto produtos[]){
		this.setTot(0);
		for(int i = 0; i <= produtos.length -1;i++){
			JOptionPane.showMessageDialog(null, 
					"Produto: " + produtos[i].getClass().getSimpleName() + 
					"\nPreço de Custo: " + produtos[i].getPrecoCusto()+
					"Estoque: " + produtos[i].getEstoqueDisponivel());
			
			this.setTot(this.getTot()+(produtos[i].getPrecoCusto()*produtos[i].getEstoqueDisponivel()));
		}
		
		JOptionPane.showMessageDialog(null,"Total em Estoque: "+this.getTot());
			
	}
	
	public void CriarLista(){
		int opprod =0, indice =0 ;
		Produto prod = null;
		Produto produtos[] = new Produto[10];
		do{
			opprod = Integer.parseInt(JOptionPane.showInputDialog(
					null, "Digite o produto desejado: "+
							 "\n1 - Livro "+
							 "\n2 - DVD"+
							 "\n3 - CD"+
							 "\n0 - Lista de produtos cadastrados"));
			if (opprod == 1 ){
				prod = new Livro();
			}
			if(opprod == 2 ){
				prod = new Dvd();
			}
			if(opprod == 3 ){
				prod = new Cd();
			}	
			if(opprod !=0){
				prod.setDescricao(JOptionPane.showInputDialog(null,"Digite a descrição: "));
				prod.setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o estoque disponivel: ")));
				prod.setPrecoCusto(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o custo: ")));
				produtos[indice] = prod;
				indice++;
				prod = null;
			}
			
			
			}while(opprod !=0);
		JOptionPane.showMessageDialog(null, MostrarLista(indice, produtos)+"\n");
	}
	
	private String MostrarLista(int tamanho, Produto[]produtos){
		String relacao = "Relação de produtos cadastrados\n";
		for(int i=0;i< tamanho;i++){
			relacao = relacao + String.valueOf(i)+
			" - Tipo: "+ produtos[i].getClass().getSimpleName() +
			" - Descrição: "+ produtos[i].getDescricao() +
			" - Estoque: "+ produtos[i].getEstoqueDisponivel() +
			" - Preço Custo: "+ produtos[i].getPrecoCusto() + "\n";
		}
		return relacao;
	}
}
