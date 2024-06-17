package br.com.animal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.animal.model.Mamifero;

public class MamiferoDAO {

	private Connection con;
	
	public final Connection getCon() {
		return con;
	}
	
	public final void setCon(Connection con) {
		this.con = con;
	}
	
	public MamiferoDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Mamifero mamifero) {
		String sql = "insert into mamifero(nome,idade,peso,quant_patas) values(?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,	mamifero.getNome());
			ps.setInt(2, mamifero.getIdade());
			ps.setDouble(3, mamifero.getPeso());
			ps.setInt(4, mamifero.getQuantidadePatas());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao Inserir";
			}
		} catch(SQLException e) {
			return e.getMessage();
		}
	}
	
	//Método de deletar 
		public String deletar(Mamifero mamifero) {
			String sql = "delete from mamifero where nome = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, mamifero.getNome());
				if(ps.executeUpdate() > 0) {
					return "Deletado com sucesso";
				} else {
					return "Erro ao deletar";
				}
			} catch(SQLException e) {
				return e.getMessage();
			}
		}


	//Método de Alterar
	public String alterar(Mamifero mamifero) {
		String sql = "update mamifero set peso = ? where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, mamifero.getNome());
			ps.setDouble(2, mamifero.getPeso());
			if (ps.executeUpdate() > 0) {
				return "Alterado com Sucesso";
			} else {
				return "Erro ao Alterar";
			}
		} catch (SQLException e) {
			return "Alterado com Sucesso";
		}
	}
	//Método de Selecionar
	public ArrayList<Mamifero> retornarDados() {
		String sql = "select * from mamifero";
		ArrayList<Mamifero> retornarMamifero = new ArrayList<Mamifero>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while(rs.next()) {
					Mamifero mamifero = new Mamifero();
					mamifero.setNome(rs.getString(1));
					mamifero.setIdade(rs.getInt(2));
					mamifero.setPeso(rs.getDouble(3));
					mamifero.setQuantidadePatas(rs.getInt(4));
				}
				return retornarMamifero;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}
}

