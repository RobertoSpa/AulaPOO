package br.edu.senai.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao(Connection con) {
		connection = con;
	}

	public void atualizarCliente(Cliente cliente) {
		try {
			String sql = "update cliente set nome=?,telefone=?,email=? where codigo=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			// connection.close();
		} catch (Exception e) {
			System.out.println("Não foi possível alterar o registro!");
			e.printStackTrace();
		}
	}

	public void deletarCliente(Cliente cliente) {
		try {
			String sql = "delete from cliente where codigo=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			connection.close();

		} catch (Exception e) {
			System.out.println("Não foi possível deletar o usuario!");
			e.printStackTrace();
		}
	}

	public List<Cliente> listarClientes() {
		List<Cliente> clientes = new ArrayList<>();
		try {
			String sql = "select * from cliente";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("codigo"), rs.getString("nome"), rs.getString("telefone"),
						rs.getString("email"));
				clientes.add(cliente);
			}
			stmt.close();
			rs.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("erro na listagem");
			e.printStackTrace();
		}

		return clientes;
	}

	public void inserirCliente(Cliente cliente) {
		try {
			String sql = "insert into cliente (nome,telefone,email) values(?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();
			// connection.close();

		} catch (Exception e) {
			System.out.println("Não foi possível gravar o registro!");
		}
	}

}