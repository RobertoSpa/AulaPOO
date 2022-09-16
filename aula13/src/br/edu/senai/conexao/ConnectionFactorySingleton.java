package br.edu.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactorySingleton {
	private static String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
	private static String usuario = "postgres";
	private static String senha = "camisadedragao";
	private static Connection connection = null;

	private static Connection newConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(urlConexao, usuario, senha);
		} catch (SQLException e) {
			System.out.println("n foi possivel abrir a conexao");
		}
		return con;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
			System.out.println("conectado com sucesso");

		}
		return connection;
	}
}
