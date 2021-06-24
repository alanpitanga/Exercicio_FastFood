package main.fastfood.model;

public class Funcionario extends Pessoa {
	
	private int matricula, carteiraTrabalho;

	public Funcionario(String nome, int idade, int identidade) {
		super(nome, idade, identidade);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(int carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", carteiraTrabalho=" + carteiraTrabalho + "]";
	}
	 

}
