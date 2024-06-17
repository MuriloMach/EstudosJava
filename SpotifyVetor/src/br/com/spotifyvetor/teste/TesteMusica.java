package br.com.spotifyvetor.teste;

import javax.swing.JOptionPane;

import br.com.spotifyvetor.model.Musica;

public class TesteMusica {

	public static void main(String[] args) {
		
		int resposta = 0;
		String nomeMusica = "";
		String genero = "";
		int qtdeMusica = 0;
		int qtdeAlbum = 0;
		int indice = 0;
		
		Musica[] musicas = new Musica[2];
		
		while(resposta == 0) {
			nomeMusica = JOptionPane.showInputDialog("Digite o nome da música: ");
			genero = JOptionPane.showInputDialog("Digite o gênero musical dessa música: ");
			qtdeMusica = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de músicas que esse cantor tem: "));
			qtdeAlbum = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de álbuns que esse cantor tem: "));
			
			
			musicas[indice] = new Musica();
			musicas[indice].setNomeMusica(nomeMusica);
			musicas[indice].setGenero(genero);
			musicas[indice].setQtdeMusica(qtdeMusica);
			musicas[indice].setQtdeAlbum(qtdeAlbum);
			
			indice++;
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar", "Camadas", 
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE
						);
		}
		for(int i=0; i<indice; i++) {
			System.out.println("Nome da Música: " + musicas[i].getNomeMusica() + 
								"\nGênero: " + musicas[i].getGenero() + 
								"\nQuantidade de Músicas: " + musicas[i].getQtdeMusica() + 
								"\nQuantidade de Álbuns: " + musicas[i].getQtdeAlbum() 
								);
		}

	}

}
