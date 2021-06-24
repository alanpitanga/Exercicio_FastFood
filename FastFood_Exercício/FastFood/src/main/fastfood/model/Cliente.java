package main.fastfood.model;



public class Cliente extends Pessoa {
	private Endereco endereco;
	



	public Cliente(String nome, int idade, int identidade) {
		super(nome, idade, identidade);
	}
	


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
	
	
	
}
