package com.hotel.sistema;

import java.util.List;

import com.hotel.pessoa.Gerente;

public class Hotel {

	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private Gerente gerente;
	private List<Reserva> listaReservas;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(String nome, Endereco endereco, List<Reserva> listaReservas, Telefone telefone, Gerente gerente) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.listaReservas = listaReservas;
		this.telefone = telefone;	
		this.gerente = gerente;
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

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	
}
