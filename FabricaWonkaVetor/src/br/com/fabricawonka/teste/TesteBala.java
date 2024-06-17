package br.com.fabricawonka.teste;

import javax.swing.JOptionPane;

import br.com.fabricawonka.model.Bala;

public class TesteBala {

	public static void main(String[] args) {
		
		int resposta = 0;
		String nome = "";
		int qtdeBalas = 0;
		int indice = 0;
		
		while(resposta == 0) {
			nome = JOptionPane.showInputDialog("Digite o nome da Bala: ");
			qtdeBalas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de balas que tem no saco: "));
			
			Bala[] bala = new Bala[3];
			
			bala[indice] = new Bala();
			bala[indice].setNome(nome);
			bala[indice].setQtdeBalas(qtdeBalas);
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar", "Camadas",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE
						);
		}

	}

}
