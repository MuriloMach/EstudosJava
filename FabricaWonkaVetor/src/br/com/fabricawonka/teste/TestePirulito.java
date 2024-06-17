package br.com.fabricawonka.teste;

import javax.swing.JOptionPane;

import br.com.fabricawonka.model.Pirulito;

public class TestePirulito {

	public static void main(String[] args) {
		
		int resposta = 0;
		String nome = "";
		String marca = "";
		int indice = 0;
		
		while(resposta == 0) {
			nome = JOptionPane.showInputDialog("Digite o nome do pirulito: ");
			marca = JOptionPane.showInputDialog("Digite a marca do pirulito: ");
			
			Pirulito[] pirulito = new Pirulito[3];
			
			pirulito[indice] = new Pirulito();
			pirulito[indice].setNome(nome);
			pirulito[indice].setMarca(marca);
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar", "Camadas",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE
						);
		}

	}

}
