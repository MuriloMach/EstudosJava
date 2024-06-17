package br.com.animal.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.animal.conexao.Conexao;
import br.com.animal.dao.MamiferoDAO;
import br.com.animal.model.Mamifero;

public class ProgramaSelecionar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		MamiferoDAO mamiferodao = new MamiferoDAO(con);
		
		ArrayList<Mamifero> lista = mamiferodao.retornarDados();
		
		if(lista != null) {
			for (Mamifero p : lista) {
				System.out.println("Nome: " + p.getNome());
				System.out.println("Idade" + p.getIdade());
				System.out.println("Peso: " + p.getPeso());
				System.out.println("Quantidade de Patas: " + p.getQuantidadePatas());
			}
		}
		
		Conexao.fecharConexao(con);

	}

}
