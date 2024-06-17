package br.com.carrinhodecompra.model;

public class Produto {
	private String tipo;
	private String marca;
	private int quantidade;
	private double valor;
	
	//Construtor Vazio
	public Produto() {
	}
	
	//Construtor Cheio
	public Produto(String recebeTipo, String recebeMarca, int recebeQuantidade, double recebeValor) {
		super();
		setTipo(recebeTipo);
		setMarca(recebeMarca);
		setQuantidade(recebeQuantidade);
		setValor(recebeValor);
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
