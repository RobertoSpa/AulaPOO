package br.edu.senai.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.senai.conexao.ConnectionFactory;
import br.edu.senai.model.Cliente;
import br.edu.senai.persistence.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(null, "paulin", "77862", "pau@mail.com");
		Cliente cliente2 = new Cliente(null, "zanderzon", "67598", "zztop@mail.com");

		Connection connection = new ConnectionFactory().getConnection();

		ClienteDao clientedao = new ClienteDao(connection);
		try {
			connection.setAutoCommit(false);
			clientedao.inserirCliente(cliente);
			clientedao.inserirCliente(cliente2);
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// clientedao.atualizarCliente(cliente);
		// clientedao.deletarCliente(cliente);
		// System.out.println(clientedao.listarClientes());
//		for (Cliente xubiruba : clientedao.listarClientes()) {
//			System.out.println(xubiruba);
//		}
	}

}
