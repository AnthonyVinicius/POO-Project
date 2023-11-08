package com.hotel.pessoa;

public class Cliente extends Pessoa {

	private String email;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
