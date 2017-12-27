/**
 * 
 */
package livpoliarray;

import javax.swing.JOptionPane;

/**
 * @author etec
 *
 */
public class Livro extends Produto {
	// Atributos ###################################################################################
		private String autor;
		private String editora;
		private String edicao;
	
			
		public Livro() {
			this("","",0,0f,0f,"","","");
		}
	/**
	 * @param descricao
	 * @param genero
	 * @param estoqueDisponivel
	 * @param precoCusto
	 * @param precoVenda
	 */
		public Livro(String descricao, String genero, int estoqueDisponivel, float precoCusto, float precoVenda,
				String autor, String editora, String edicao) {
			super(descricao, genero, estoqueDisponivel, precoCusto,precoVenda);
			this.autor = autor;
			this.editora = editora;
			this.edicao = edicao;
		}
		
		
		
		

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return this.autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the editora
	 */
	public String getEditora() {
		return this.editora;
	}
	/**
	 * @param editora the editora to set
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}
	/**
	 * @return the edicao
	 */
	public String getEdicao() {
		return this.edicao;
	}
	/**
	 * @param edicao the edicao to set
	 */
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	/* (non-Javadoc)
	 * @see livpoliarray.Produto#listarProduto()
	 */
	@Override
	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "Livro: " + 
				"\nDescrição: " + this.getDescricao() +
				"\nGenero: " + this.getGenero() +
				"\nEstoque: " + this.getEstoqueDisponivel()+
				"\nCusto: " + this.getPrecoCusto()+
				"\nAutor: "+ this.getAutor()+
				"\nEditora: " + this.getEditora()+
				"\nEdição: " + this.getEdicao());

	}

	/* (non-Javadoc)
	 * @see livpoliarray.Produto#calculaPrecoVenda()
	 */
	@Override
	public void calculaPrecoVenda() {
		this.setPrecoVenda(this.getPrecoCusto() * 1.3f);
		JOptionPane.showMessageDialog(null, "Custo: " +
				this.getPrecoCusto() + "\n30% - Venda: "+this.getPrecoVenda());

	}

}
