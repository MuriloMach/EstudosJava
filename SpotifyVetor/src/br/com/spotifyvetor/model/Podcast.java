package br.com.spotifyvetor.model;

public class Podcast extends Catalogo{
	private String nomePodcast;
	private String genero;
	private int qtdeEpisodio;
	public String getNomePodcast() {
		return nomePodcast;
	}
	public void setNomePodcast(String nomePodcast) {
		this.nomePodcast = nomePodcast;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getQtdeEpisodio() {
		return qtdeEpisodio;
	}
	public void setQtdeEpisodio(int qtdeEpisodio) {
		this.qtdeEpisodio = qtdeEpisodio;
	}
	
}
