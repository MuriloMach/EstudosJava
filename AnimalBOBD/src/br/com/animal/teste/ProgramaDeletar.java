package br.com.animal.teste;

import java.sql.Connection;

import br.com.animal.conexao.Conexao;
import br.com.animal.dao.MamiferoDAO;
import br.com.animal.model.Mamifero;

public class ProgramaDeletar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Mamifero mamifero = new Mamifero();
		MamiferoDAO mamiferodao = new MamiferoDAO(con);
		
		mamifero.setNome("Joãzinho");
		System.out.println(mamiferodao.deletar(mamifero));
		Conexao.fecharConexao(con);
		
	}

}
