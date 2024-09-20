package br.com.construtora.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mainConstrutors {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

		System.out.println("Oi");
		Connection conexao = null;
		// Na linha abaixo, estou armazenando o caminho do BD na variável url
		String url = "jdbc:mysql://localhost:3307/construtora";
		conexao = DriverManager.getConnection(url, "root", "*123456HAS*");
		System.out.println("Abriu a conexão.");
		conexao.close();
		
	}

}
