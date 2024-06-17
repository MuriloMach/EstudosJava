package br.com.fabricanestle.model;

public class Bala extends Doce{
	private int qtdePacoteBala;
	private String marcaBala;
	private String saborBala;
	
	//Construtor Vazio
	public Bala() {
	}
	
	//Construtor Cheio
	public Bala(String recebeNome, int recebeQtdePacoteBala, String recebeMarcaBala, String recebeSabor) {
		super(recebeNome);
		setQtdePacoteBala(recebeQtdePacoteBala);
		setMarcaBala(recebeMarcaBala);
		setSaborBala(recebeSabor);
	}
	public int getQtdePacoteBala() {
		return qtdePacoteBala;
	}

	public void setQtdePacoteBala(int qtdePacoteBala) {
		this.qtdePacoteBala = qtdePacoteBala;
	}

	public String getMarcaBala() {
		return marcaBala;
	}

	public void setMarcaBala(String marcaBala) {
		this.marcaBala = marcaBala;
	}

	public String getSaborBala() {
		return saborBala;
	}

	public void setSaborBala(String saborBala) {
		this.saborBala = saborBala;
	}
}
