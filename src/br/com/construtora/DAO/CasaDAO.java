package br.com.construtora.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.contrutora.beans.Casa;


public class CasaDAO {

	private Connection con;

	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public CasaDAO() {
	}
	public CasaDAO(Connection con) {
		setCon(con);
	}
	
	
	public String inserirCasa(Casa casa) {
		String sql = "insert into Casa(quantidadedeQuintal, metrosQuadrados, quantidadeQuartos, quantidadesBanheiros, enderecoCompleto) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, casa.getQuantidadedeQuintal());
			ps.setDouble(2, casa.getMetrosQuadrados());
			ps.setInt(3, casa.getQuantidadeQuartos());
			ps.setDouble(4, casa.getQuantidadesBanheiros());
			ps.setString(5, casa.getEnderecoCompleto());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	public String deltarSemWhere() {
		String sql = "delete from Casa";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	

}
