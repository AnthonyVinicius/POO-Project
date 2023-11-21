package com.hotel.sistema;

import java.util.List;

import com.hotel.pessoa.Gerente;

public class Hotel {

	private String nome;
	private String cnpj;

	private Endereco endereco;
	private Gerente gerente;
	private List<Telefone> listaTelefones;
	private List<Reserva> listaReservas;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(String nome, String cnpj, Endereco endereco, Gerente gerente, List<Telefone> listaTelefones,
			List<Reserva> listaReservas) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.gerente = gerente;
		this.listaTelefones = listaTelefones;
		this.listaReservas = listaReservas;
	}

	public void mostrarInformacoesReservas() {
		int r = 1;
		System.out.println("Hotel: " + getNome());
		for (Reserva reserva : listaReservas) {
			System.out.println("\n" +r + "°" + "Reserva: ");
			System.out.println("Data: " + reserva.getData());
			System.out.println("Funcionario responsalvel: " + reserva.getFuncionario().getNome());
			System.out.println("Setor: " + reserva.getFuncionario().getSetor());
			System.out.println("Cliente: " + reserva.getCliente().getNome());
			r++;

			int q = 1;
			for (Quarto quarto : reserva.getListaQuartos()) {
				System.out.println(q + "°" + "Quarto");
				System.out.println("Num: " + quarto.getNumero());
				q++;
				
				for (Cama cama : quarto.getCama()) {
					System.out.println("Cama: " + cama.getTipo());
				}
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Telefone> getListaTelefones() {
		return listaTelefones;
	}

	public void setListaTelefones(List<Telefone> listaTelefones) {
		this.listaTelefones = listaTelefones;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
}
