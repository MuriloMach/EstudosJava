package br.com.spotifyvetor.model;

public class Musica extends Catalogo {
	private String nomeMusica;
	private int qtdeMusica;
	private int qtdeAlbum;
	private String genero;
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public int getQtdeMusica() {
		return qtdeMusica;
	}
	public void setQtdeMusica(int qtdeMusica) {
		this.qtdeMusica = qtdeMusica;
	}
	public int getQtdeAlbum() {
		return qtdeAlbum;
	}
	public void setQtdeAlbum(int qtdeAlbum) {
		this.qtdeAlbum = qtdeAlbum;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
