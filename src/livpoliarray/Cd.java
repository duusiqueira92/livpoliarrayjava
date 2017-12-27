package livpoliarray;

import javax.swing.JOptionPane;

public class Cd extends Produto {
		// Atributos ###################################################################################
		private String artista; 
		private String gravadora;
		private String pais;
		
		
		// Construtor ###################################################################################	
		public Cd() {
			this("","",0,0f,0f,"","","");
		}

		public Cd(String descricao, String genero, Integer qtdeDisponivel, float precoCusto, float precoVenda,
				String artista, String gravadora, String pais) {
			super(descricao, genero, qtdeDisponivel, precoCusto, precoVenda);
			this.artista = artista;
			this.gravadora = gravadora;
			this.pais = pais;
		}
		
		

		/**
		 * @return the artista
		 */
		public String getArtista() {
			return this.artista;
		}

		/**
		 * @param artista the artista to set
		 */
		public void setArtista(String artista) {
			this.artista = artista;
		}

		/**
		 * @return the gravadora
		 */
		public String getGravadora() {
			return this.gravadora;
		}

		/**
		 * @param gravadora the gravadora to set
		 */
		public void setGravadora(String gravadora) {
			this.gravadora = gravadora;
		}

		/**
		 * @return the pais
		 */
		public String getPaisOrigem() {
			return this.pais;
		}

		/**
		 * @param pais the pais to set
		 */
		public void setPaisOrigem(String pais) {
			this.pais = pais;
		}

		@Override
		public void listarProduto() {
			JOptionPane.showMessageDialog(null, "Livro: " + 
					"\nDescrição: " + this.getDescricao() +
					"\nGenero: " + this.getGenero() +
					"\nEstoque: " + this.getEstoqueDisponivel()+
					"\nCusto: " + this.getPrecoCusto()+
					"\nArtista: "+ this.getArtista()+
					"\nGravadora: " + this.getGravadora()+
					"\nPais: " + this.getPaisOrigem());
	
		}
	
		@Override
		public void calculaPrecoVenda() {
			// TODO Auto-generated method stub
			this.setPrecoVenda(this.getPrecoCusto() * 1.5f);
			JOptionPane.showMessageDialog(null, "Custo: " +
					this.getPrecoCusto() + "\n50% - Venda: "+this.getPrecoVenda());
		}

}
