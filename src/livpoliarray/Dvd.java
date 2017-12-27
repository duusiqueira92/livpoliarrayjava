package livpoliarray;

import javax.swing.JOptionPane;

public class Dvd extends Produto {
	private String diretor;
	private String duracao;
	private String censura;
	
	public Dvd() {
		this("","",0,0f,0f,"","","");
	}

	public Dvd(String descricao, String genero, Integer qtdeDisponivel, float precoCusto, float precoVenda,
			String diretor, String duracao, String censura) {
		super(descricao, genero, qtdeDisponivel, precoCusto, precoVenda);
		this.diretor = diretor;
		this.duracao = duracao;
		this.censura = censura;
	}
	
	

	/**
	 * @return the diretor
	 */
	public String getDiretor() {
		return this.diretor;
	}

	/**
	 * @param diretor the diretor to set
	 */
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	/**
	 * @return the duracao
	 */
	public String getDuracao() {
		return this.duracao;
	}

	/**
	 * @param duracao the duracao to set
	 */
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	/**
	 * @return the censura
	 */
	public String getCensura() {
		return this.censura;
	}

	/**
	 * @param censura the censura to set
	 */
	public void setCensura(String censura) {
		this.censura = censura;
	}

	@Override
	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "Livro: " + 
				"\nDescrição: " + this.getDescricao() +
				"\nGenero: " + this.getGenero() +
				"\nEstoque: " + this.getEstoqueDisponivel()+
				"\nCusto: " + this.getPrecoCusto()+
				"\nDiretor: "+ this.getDiretor()+
				"\nDuração: " + this.getDuracao()+
				"\nCensura: " + this.getCensura());
	}

	@Override
	public void calculaPrecoVenda() {
		this.setPrecoVenda(this.getPrecoCusto() * 1.7f);
		JOptionPane.showMessageDialog(null, "Custo: " +
				this.getPrecoCusto() + "\n70% - Venda: "+this.getPrecoVenda());

	}
	
	public void calculaPrecoVenda(float dolar) {
		this.setPrecoVenda(this.getPrecoCusto() + (this.precoCusto * dolar));
		
		JOptionPane.showMessageDialog(null, "Custo: " +
				this.getPrecoCusto() + "\nmultiplicado pela cotação do dolar: "+this.getPrecoVenda());
		
		
	}

}
