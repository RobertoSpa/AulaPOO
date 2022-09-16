package br.edu.senai.conexao;

import java.sql.Connection;

public class TesteConexaoSingleton {

	public static void main(String[] args) {
		Connection con = ConnectionFactorySingleton.getConnection();

	}

}
