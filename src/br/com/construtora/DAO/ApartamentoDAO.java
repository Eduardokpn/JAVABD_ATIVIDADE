package br.com.construtora.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.contrutora.beans.Apartamento;
import br.com.contrutora.beans.Casa;

public class ApartamentoDAO {
	
	private Connection con;

	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public ApartamentoDAO() {
	}
	public ApartamentoDAO(Connection con) {
		setCon(con);
	}
	
	
	public String inserirApartamento(Apartamento apart) {
		String sql = "insert into Apartamento(quantidadedeVaranda, metrosQuadrados, quantidadeQuartos, quantidadesBanheiros, enderecoCompleto) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, apart.getQauntidadeVaranda());
			ps.setDouble(2, apart.getMetrosQuadrados());
			ps.setInt(3, apart.getQuantidadeQuartos());
			ps.setDouble(4, apart.getQuantidadesBanheiros());
			ps.setString(5, apart.getEnderecoCompleto());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
