package main.fastfood.model;

public class Entregador extends Pessoa {
	private int carteiraTrabalho;
	private Veiculo veiculo;
	
	
	
	public Entregador(String nome, int idade, int identidade) {
		super(nome, idade, identidade);
		// TODO Auto-generated constructor stub
	}
	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	public void setCarteiraTrabalho(int carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	
}
