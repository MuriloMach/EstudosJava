package br.com.fabricanestle.model;

public class Bolacha extends Doce{
	private String saborBolacha;
	private int qtdePacoteBolacha;
	private String marcaBolacha;
	
	//Construtor Vazio
	public Bolacha() {
	}
	
	//Construtor Cheio
	public Bolacha(String recebeNome, String recebeSaborBolacha, int recebeQtdePacoteBolacha, String recebeMarcaBolacha) {
		super(recebeNome);
		setSaborBolacha(recebeSaborBolacha);
		setQtdePacoteBolacha(recebeQtdePacoteBolacha);
		setMarcaBolacha(recebeMarcaBolacha);
	}
	public String getSaborBolacha() {
		return saborBolacha;
	}
	public void setSaborBolacha(String saborBolacha) {
		this.saborBolacha = saborBolacha;
	}
	public int getQtdePacoteBolacha() {
		return qtdePacoteBolacha;
	}
	public void setQtdePacoteBolacha(int qtdePacoteBolacha) {
		this.qtdePacoteBolacha = qtdePacoteBolacha;
	}
	public String getMarcaBolacha() {
		return marcaBolacha;
	}
	public void setMarcaBolacha(String marcaBolacha) {
		this.marcaBolacha = marcaBolacha;
	}
	
}
