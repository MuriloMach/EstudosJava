package br.com.animal.teste;

import java.sql.Connection;

import br.com.animal.bo.Excecao;
import br.com.animal.bo.MamiferoBO;
import br.com.animal.conexao.Conexao;
import br.com.animal.model.Mamifero;

public class ProgramaInserir {

	public static void main(String[] args) throws Excecao {
		
		Connection con = Conexao.abrirConexao();
		
		Mamifero mamifero = new Mamifero();
		/*MamiferoDAO mamiferodao = new MamiferoDAO(con);*/
		MamiferoBO mamiferobo = new MamiferoBO();
		
		
		//Testando o método inserir
		mamifero.setNome("Welligton");
		mamifero.setIdade(3);
		mamifero.setPeso(29.9);
		mamifero.setQuantidadePatas(4);
		mamiferobo.inserirBO(mamifero);
		Conexao.fecharConexao(con);

	}

}
