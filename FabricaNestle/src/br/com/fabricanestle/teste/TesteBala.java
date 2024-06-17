package br.com.fabricanestle.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fabricanestle.model.Bala;

public class TesteBala {

	public static void main(String[] args) {
		
		Bala balaUm = new Bala();
		Bala balaDois = new Bala();
		
		balaUm.setNome(JOptionPane.showInputDialog("Digite o nome da bala: "));
		balaUm.setQtdePacoteBala(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de balas dentro do pacote: ")));
		balaUm.setMarcaBala(JOptionPane.showInputDialog("Digite o nome da marca dessa bala: "));
		balaUm.setSaborBala(JOptionPane.showInputDialog("Digite o sabor dessa bala: "));
		
		balaDois.setNome(JOptionPane.showInputDialog("Digite o nome da bala: "));
		balaDois.setQtdePacoteBala(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de balas dentro do pacote: ")));
		balaDois.setMarcaBala(JOptionPane.showInputDialog("Digite o nome da marca dessa bala: "));
		balaDois.setSaborBala(JOptionPane.showInputDialog("Digite o sabor dessa bala: "));
		
		List<Bala> balas = new ArrayList<Bala>();
		
		balas.add(balaUm);
		balas.add(balaDois);
		
		for(Bala balasExibir : balas) {
			System.out.println(balasExibir.getNome() + " " +
								balasExibir.getQtdePacoteBala() + " " + 
								balasExibir.getMarcaBala() + " " +
								balasExibir.getSaborBala() + "\n"
								);
		}
		
		
		
				
	}

}
