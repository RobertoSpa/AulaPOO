package br.edu.senai.model;

import java.time.LocalDate;

import br.edu.senai.enums.Bebida;
import br.edu.senai.enums.Sanduiche;

public class Pedido {
	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;

	public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduice) {
		super();
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduice;
	}

	@Override
	public String toString() {
		return "Pedido [dataPedido=" + dataPedido + ", bebida: " + bebida + ", sanduiche: " + sanduiche + "]";
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public Sanduiche getSanduice() {
		return sanduiche;
	}

	public void imprimirCardapio() {
		for (Bebida batata : Bebida.values()) {
			System.out.println("*****************");
			System.out.println(batata);
		}

		for (Sanduiche banana : Sanduiche.values()) {
			System.out.println("*****************");
			System.out.println(banana);
		}
	}

}
