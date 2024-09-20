package br.com.contrutora.testeDAO;

import java.sql.Connection;

import br.com.construtora.DAO.CasaDAO;
import br.com.construtora.conexao.conexaoAtiva;
import br.com.contrutora.beans.Casa;

public class TesteUpdateCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection con = conexaoAtiva.abrirConexao();
		
		Casa casa = new Casa();
		CasaDAO casadao = new CasaDAO(con);
		
		casa.setQuantidadesBanheiros(3);
		casa.setMetrosQuadrados(25);
		
		
		
		System.out.println(casadao.upadteCasaComWhere(casa));
		
		conexaoAtiva.fecharConexao(con);
		
		
		
		
	}

}
