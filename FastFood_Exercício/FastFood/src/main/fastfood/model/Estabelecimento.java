package main.fastfood.model;

public class Estabelecimento {
	private Endereco endereco;
	private Pessoa proprietario;
	private Funcionario lista;
	
	public Estabelecimento(Endereco endereco, Pessoa proprietario) {
		super();
		this.endereco = endereco;
		this.proprietario = proprietario;
	}
	
	

	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Pessoa getProprietario() {
		return proprietario;
	}



	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}



	public Funcionario getFuncionario() {
		return lista;
	}



	public void setFuncionario(Funcionario lista) {
		this.lista = lista;
	}



	@Override
	public String toString() {
		return "Estabelecimento [endereco=" + endereco + ", proprietario=" + proprietario + "]";
	}
	
	


}
