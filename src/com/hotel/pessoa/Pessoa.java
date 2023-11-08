package com.hotel.pessoa;

import com.hotel.sistema.Endereco;
import com.hotel.sistema.Telefone;

public abstract class Pessoa {

	protected String nome;
	protected String rg;
	protected Endereco endereco;
	protected Telefone telefone;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String rg, Endereco endereco, Telefone telefone) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
}
