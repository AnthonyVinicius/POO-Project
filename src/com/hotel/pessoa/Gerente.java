package com.hotel.pessoa;

public class Gerente extends Pessoa {

	private String codigoDeAcesso;

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public Gerente(String codigoDeAcesso) {
		super();
		this.codigoDeAcesso = codigoDeAcesso;
	}

	public String getCodigoDeAcesso() {
		return codigoDeAcesso;
	}

	public void setCodigoDeAcesso(String codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}
}
