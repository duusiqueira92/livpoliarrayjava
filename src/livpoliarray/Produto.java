package livpoliarray;

public abstract class Produto {
	protected String descricao;
	protected String genero;
	protected int estoque;
	protected float precoCusto;
	protected float precoVenda;
	
	/**
	 * Construtores 
	 */
	
	/**
	 * Contrutor Vazio
	 */
	
	public Produto() {
		this("","",0,0f,0f);
	}

	/*
	 * Construtor com Campos Field (Parametros)
	 */
	
	public Produto(String descricao, String genero, int estoque, float precoCusto, float precoVenda) {
		super();
		this.descricao = descricao;
		this.genero = genero;
		this.estoque = estoque;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return this.genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the estoque
	 */
	public int getEstoqueDisponivel() {
		return this.estoque;
	}

	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoqueDisponivel(int estoque) {
		this.estoque = estoque;
	}

	/**
	 * @return the precoCusto
	 */
	public float getPrecoCusto() {
		return this.precoCusto;
	}

	/**
	 * @param precoCusto the precoCusto to set
	 */
	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	/**
	 * @return the precoVenda
	 */
	public float getPrecoVenda() {
		return this.precoVenda;
	}

	/**
	 * @param precoVenda the precoVenda to set
	 */
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	

	/*
	 * Metodos Diversos
	 * 
	 */
	
	public abstract void listarProduto();
	public abstract void calculaPrecoVenda();
}
