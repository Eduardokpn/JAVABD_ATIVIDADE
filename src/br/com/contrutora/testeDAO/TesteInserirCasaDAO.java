package br.com.contrutora.testeDAO;

import java.sql.Connection;

import br.com.construtora.DAO.CasaDAO;
import br.com.construtora.conexao.conexaoAtiva;
import br.com.contrutora.beans.Casa;


public class TesteInserirCasaDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = conexaoAtiva.abrirConexao();
		
		Casa casa = new Casa();
		CasaDAO casaDAO = new CasaDAO(con);
		
		casa.setEnderecoCompleto("edson");
		casa.setMetrosQuadrados(25);
		casa.setQuantidadedeQuintal(4);
		casa.setQuantidadeQuartos(2);
		casa.setQuantidadesBanheiros(6);

				
		System.out.println(casaDAO.inserirCasa(casa));
		
		conexaoAtiva.fecharConexao(con);
		
		

	}

}
