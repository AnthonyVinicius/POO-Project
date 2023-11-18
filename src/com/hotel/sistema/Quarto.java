package com.hotel.sistema;

import java.util.List;

public class Quarto {
	
	private int numero;
	
	private List<Cama> cama;
	
	public Quarto() {
		// TODO Auto-generated constructor stub
	}

	public Quarto(int numero, List<Cama> cama) {
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

	public List<Cama> getCama() {
		return cama;
	}

	public void setCama(List<Cama> cama) {
		this.cama = cama;
	}
}
