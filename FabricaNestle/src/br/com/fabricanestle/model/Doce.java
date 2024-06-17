package br.com.fabricanestle.model;

public class Doce {
	private String nome;
	
	//Construtor Vazio
	public Doce() {
	}
	
	//Construtor Cheio
	public Doce(String recebeNome) {
		setNome(recebeNome);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
