package com.hotel.sistema;

public class Quarto {
	
	private int numero;
	private Cama cama;
	
	public Quarto() {
		// TODO Auto-generated constructor stub
	}

	public Quarto(int numero, Cama cama) {
		super();
		this.numero = numero;
		this.cama = cama;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cama getCama() {
		return cama;
	}

	public void setCama(Cama cama) {
		this.cama = cama;
	}
}
