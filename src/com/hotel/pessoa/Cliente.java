package com.hotel.pessoa;

import java.util.List;

import com.hotel.sistema.Endereco;
import com.hotel.sistema.Pagamento;
import com.hotel.sistema.Reserva;
import com.hotel.sistema.Telefone;

public class Cliente extends Pessoa {

	private String email;
	private List<Reserva> listasReservas;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String cpf, Endereco endereco, Telefone telefone, String email, List<Reserva> listasReservas) {
		super(nome, cpf, endereco, telefone);
		this.email = email;
		this.listasReservas = listasReservas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reserva> getListasReservas() {
		return listasReservas;
	}

	public void setListasReservas(List<Reserva> listasReservas) {
		this.listasReservas = listasReservas;
	}
}
