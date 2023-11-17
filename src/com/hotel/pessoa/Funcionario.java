package com.hotel.pessoa;

import com.hotel.sistema.Endereco;
import com.hotel.sistema.Telefone;

public class Funcionario extends Pessoa {

	private String setor;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, String cpf, Endereco endereco, Telefone telefone, String setor) {
		super(nome, cpf, endereco, telefone);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
