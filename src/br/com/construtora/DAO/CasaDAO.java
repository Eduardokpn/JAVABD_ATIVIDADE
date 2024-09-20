package br.com.construtora.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public String deltarcomWhere(Casa casa) {
		String sql = "delete from Casa where quantidadeQuartos like (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, casa.getQuantidadeQuartos());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String upadteCasaComWhere(Casa casa) {
		String sql = "update Casa set quantidadesBanheiros = (?) where metrosQuadrados = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, casa.getQuantidadesBanheiros());
			ps.setDouble(2, casa.getMetrosQuadrados());
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao altera";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	public ArrayList<Casa> retomarDadosLiquidificador() {
		String sql = "select * from Casa";
		ArrayList<Casa> retornarCasa = new ArrayList<Casa>();
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null){
				while(rs.next())
				{
					Casa casa = new Casa();
					
					casa.setMetrosQuadrados(rs.getDouble(1));
					casa.setQuantidadedeQuintal(rs.getInt(2));
					casa.setQuantidadeQuartos(rs.getInt(3));
					casa.setQuantidadesBanheiros(rs.getInt(4));
					casa.setEnderecoCompleto(rs.getString(5));
				}
				return retornarCasa;
			
			} else {
				return null;
				
		} }
		catch (SQLException e) {
			return null;
		}
		}
	
	
	

}
