package com.hotel.pessoa;

import com.hotel.sistema.Endereco;
import com.hotel.sistema.Telefone;

public class Cliente extends Pessoa {

	private String email;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String rg, Endereco endereco, Telefone telefone, String email) {
		super(nome, rg, endereco, telefone);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
