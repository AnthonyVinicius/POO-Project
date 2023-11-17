package com.hotel.pessoa;

import com.hotel.sistema.Endereco;
import com.hotel.sistema.Telefone;

public class Gerente extends Pessoa {

	private String codigoDeAcesso;

	public Gerente() {

	}

	public Gerente(String nome, String cpf, Endereco endereco, Telefone telefone, String codigoDeAcesso) {
		super(nome, cpf, endereco, telefone);
		this.codigoDeAcesso = codigoDeAcesso;
	}

	public String getCodigoDeAcesso() {
		return codigoDeAcesso;
	}

	public void setCodigoDeAcesso(String codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}
}
