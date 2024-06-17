package br.com.fabricawonka.teste;

import javax.swing.JOptionPane;

import br.com.fabricawonka.model.Bolo;

public class TesteBolo {

	public static void main(String[] args) {
		
		int resposta = 0;
		String nome = "";
		int camadas = 0;
		int indice = 0;
		
		while(resposta == 0) {
			nome = JOptionPane.showInputDialog("Digite o nome do bolo: ");
			camadas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas camadas tem esse bolo: "));
			
			Bolo[] bolo = new Bolo[3];
			
			bolo[indice] = new Bolo();
			bolo[indice].setNome(nome);
			bolo[indice].setCamadas(camadas);
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar", "Camadas",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE
						);
		}

	}

}
