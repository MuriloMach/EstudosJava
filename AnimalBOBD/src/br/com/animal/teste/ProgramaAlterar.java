package br.com.animal.teste;

import java.sql.Connection;

import br.com.animal.conexao.Conexao;
import br.com.animal.dao.MamiferoDAO;
import br.com.animal.model.Mamifero;

public class ProgramaAlterar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		Mamifero mamifero = new Mamifero();
		MamiferoDAO mamiferodao = new MamiferoDAO(con);
		
		mamifero.setNome("Jurisvaldo");
		mamifero.setIdade(12);
		System.out.println(mamiferodao.alterar(mamifero));
		Conexao.fecharConexao(con);
	}

}
