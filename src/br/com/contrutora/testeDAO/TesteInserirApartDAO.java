package br.com.contrutora.testeDAO;

import java.sql.Connection;

import br.com.construtora.DAO.ApartamentoDAO;
import br.com.construtora.DAO.CasaDAO;
import br.com.construtora.conexao.conexaoAtiva;
import br.com.contrutora.beans.Apartamento;
import br.com.contrutora.beans.Casa;

public class TesteInserirApartDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = conexaoAtiva.abrirConexao();
		
		Apartamento aprt = new Apartamento();
		ApartamentoDAO aprtDAO = new ApartamentoDAO(con);
		
		aprt.setEnderecoCompleto("edson");
		aprt.setMetrosQuadrados(25);
		aprt.setQauntidadeVaranda(4);
		aprt.setQuantidadeQuartos(2);
		aprt.setQuantidadesBanheiros(6);

				
		System.out.println(aprtDAO.inserirApartamento(aprt));
		
		conexaoAtiva.fecharConexao(con);
		
		
		
	}

}
