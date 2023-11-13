package com.hotel.sistema;

import java.util.List;

public class Hotel {

	private String nome;
	private Endereco endereco;
	private List<Reserva> listaReservas;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(String nome, Endereco endereco, List<Reserva> listaReservas) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.listaReservas = listaReservas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
}
