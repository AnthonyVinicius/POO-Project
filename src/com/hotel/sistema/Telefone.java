package com.hotel.sistema;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}

	public Telefone(String ddd, String numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
