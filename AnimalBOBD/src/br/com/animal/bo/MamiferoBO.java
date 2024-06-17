package br.com.animal.bo;

import java.sql.Connection;

import br.com.animal.conexao.Conexao;
import br.com.animal.dao.MamiferoDAO;
import br.com.animal.model.Mamifero;

public class MamiferoBO {

	Connection con = Conexao.abrirConexao();
	
	MamiferoDAO mamiferodao = new MamiferoDAO(con);
	
	public void inserirBO(Mamifero mamifero) throws Excecao {
		if ((mamifero.getNome().length() < 2)) {
			System.out.println("Quantidade de caracteres do nome não atende o mínimo");
		} else {
			mamifero.setNome(mamifero.getNome().toUpperCase());
			
			System.out.println(mamiferodao.inserir(mamifero));
		}
	}
	

}


