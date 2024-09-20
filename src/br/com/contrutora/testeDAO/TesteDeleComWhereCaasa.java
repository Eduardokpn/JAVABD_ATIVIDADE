package br.com.contrutora.testeDAO;

import java.sql.Connection;

import br.com.construtora.DAO.CasaDAO;
import br.com.construtora.conexao.conexaoAtiva;
import br.com.contrutora.beans.Casa;

public class TesteDeleComWhereCaasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = conexaoAtiva.abrirConexao();
		
		Casa casa = new Casa();
		CasaDAO casaDAO = new CasaDAO(con);
		
		casa.setQuantidadeQuartos(4);
		
		System.out.println(casaDAO.deltarcomWhere(casa));
		
		

	}

}
