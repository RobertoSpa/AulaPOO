package br.edu.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
	private String usuario = "postgres";
	private String senha = "camisadedragao";
	private Connection connection;

	public Connection getConnection() {
		try {
			System.out.println("conectando");
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			if (connection != null) {
				System.out.println("sucesso");
			} else {
				System.out.println("falhou");
			}
		} catch (SQLException e) {
			System.out.println("driver nao encontrado");
		}
		return connection;
	}

}
