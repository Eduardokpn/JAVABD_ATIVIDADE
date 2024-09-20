package br.com.contrutora.testeDAO;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.construtora.DAO.CasaDAO;
import br.com.construtora.conexao.conexaoAtiva;
import br.com.contrutora.beans.Casa;

public class TesteSelectCASA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = conexaoAtiva.abrirConexao();

		CasaDAO casadao = new CasaDAO(con);

		ArrayList<Casa> lista = casadao.retomarDadosCasa();

		if (lista != null) {
			for (Casa p : lista) {
				System.out.println("Metros quadrados: " + p.getMetrosQuadrados());
				System.out.println("Quantidade de quartos " + p.getQuantidadeQuartos());
				System.out.println("Quantidade de banheiros " + p.getQuantidadesBanheiros());
				System.out.println("Endeço completo " + p.getEnderecoCompleto());
				System.out.println("Quantidade quintal " + p.getQuantidadedeQuintal());
			}
		}
		 conexaoAtiva.fecharConexao(con);
		

	}

}
