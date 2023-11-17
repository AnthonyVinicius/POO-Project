package com.hotel.sistema;

import java.util.List;

import com.hotel.pessoa.Gerente;

public class Hotel {

	private String nome;
	private Endereco endereco;
	private Gerente gerente;
	private List<Telefone> listaTelefones;
	private List<Reserva> listaReservas;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(String nome, Endereco endereco, Gerente gerente, List<Telefone> listaTelefones,
			List<Reserva> listaReservas) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.gerente = gerente;
		this.listaTelefones = listaTelefones;
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

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Telefone> getListaTelefones() {
		return listaTelefones;
	}

	public void setListaTelefones(List<Telefone> listaTelefones) {
		this.listaTelefones = listaTelefones;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
}
