package com.hotel.sistema;

import java.util.List;

public class Hotel {

	private String nome;
	private Endereco endereco;
	private List<Reserva> listaReservas;
	private List<Servico> listaServicos;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(String nome, Endereco endereco, List<Reserva> listaReservas, List<Servico> listaServicos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.listaReservas = listaReservas;
		this.listaServicos = listaServicos;
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

	public List<Servico> getListaServicos() {
		return listaServicos;
	}

	public void setListaServicos(List<Servico> listaServicos) {
		this.listaServicos = listaServicos;
	}

}
