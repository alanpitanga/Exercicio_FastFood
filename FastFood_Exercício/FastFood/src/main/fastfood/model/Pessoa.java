package main.fastfood.model;

public class Pessoa {

	private String nome;
	private int idade, identidade;

	public Pessoa(String nome, int idade, int identidade) {
		this.nome = nome;
		this.idade = idade;
		this.identidade = identidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", identidade=" + identidade + "]";
	}
	

}
