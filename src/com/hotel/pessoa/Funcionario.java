package com.hotel.pessoa;

public class Funcionario extends Pessoa {

	private String setor;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String setor) {
		super();
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
