package main.fastfood.model;



public class Endereco {

	private String rua, bairro, cidade, complemento;
	private int numResid;

	public Endereco(String rua, String bairro, String cidade, String complemento, int numResid) {
		
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.complemento = complemento;
		this.numResid = numResid;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumResid() {
		return numResid;
	}

	public void setNumResid(int numResid) {
		this.numResid = numResid;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", complemento=" + complemento
				+ ", numResid=" + numResid + "]";
	}
	

}
