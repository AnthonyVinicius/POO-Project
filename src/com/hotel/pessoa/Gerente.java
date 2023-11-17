package com.hotel.pessoa;

import com.hotel.sistema.Endereco;
import com.hotel.sistema.Telefone;

public class Gerente extends Pessoa {

	private String codigoDeAcesso;

	public Gerente() {

	}

	public Gerente(String nome, String rg, Endereco endereco, Telefone telefone, String codigoDeAcesso) {
		super(nome, rg, endereco, telefone);
		this.codigoDeAcesso = codigoDeAcesso;
	}

	public String getCodigoDeAcesso() {
		return codigoDeAcesso;
	}

	public void setCodigoDeAcesso(String codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}
}
