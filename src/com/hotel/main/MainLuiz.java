package com.hotel.main;

import java.util.ArrayList;
import java.util.Arrays;

import com.hotel.sistema.*;
import com.hotel.pessoa.*;

public class MainLuiz {
	public static void main(String[] args) {

		// Funcionario________________________________________________________________________________________________________________________________
		Endereco enderecoFuncionarioR1 = new Endereco("Palmares", "Cohab II", "Rua dos Carneiros", "126");
		Telefone telefoneFuncionarioR1 = new Telefone("81", "99626-5968");
		Funcionario funcionarioPedroR1 = new Funcionario("Pedro Herique ", "111-222-333-44", enderecoFuncionarioR1,
				telefoneFuncionarioR1, "Recepção");

		// Reserva_1_________________________________________________________________________________________________________________________________

		ArrayList<Quarto> listaQuartosR1 = new ArrayList<Quarto>();
		listaQuartosR1.add(new Quarto(11, new ArrayList<Cama>(Arrays.asList(new Cama("Dupla")))));
		listaQuartosR1
				.add(new Quarto(12, new ArrayList<Cama>(Arrays.asList(new Cama("Simples"), new Cama("Simples")))));

		Endereco enderecoClienteR1 = new Endereco("Recife", "Boa Viagem", "Machado 98", "68");
		Telefone telefoneClienteR1 = new Telefone("81", "98568-4513");
		Cliente clienteLuizR1 = new Cliente("Luiz Gabriel", "999-888-777-66", enderecoClienteR1, telefoneClienteR1,
				"luizgabriel@gmail.com", null, null);

		PagamentoDinheiro pagamentoDinheiroR1 = new PagamentoDinheiro("12/11/2023", null);

		Reserva reserva1 = new Reserva("12/11/2023", listaQuartosR1, funcionarioPedroR1, clienteLuizR1,
				pagamentoDinheiroR1);

		pagamentoDinheiroR1.setReserva(reserva1);

		// Reserva_2________________________________________________________________________________________________________________________________

		ArrayList<Quarto> listaQuartosR2 = new ArrayList<Quarto>();
		listaQuartosR2.add(new Quarto(56, new ArrayList<Cama>(Arrays.asList(new Cama("Simples"), new Cama("Simples")))));
		listaQuartosR2.add(new Quarto(58, new ArrayList<Cama>(Arrays.asList(new Cama("Dupla"), new Cama("Simples"), new Cama("Simples")))));

		Endereco enderecoClienteR2 = new Endereco("Maceio", "Vila Velha", "Visconde", "386");
		Telefone telefoneClienteR2 = new Telefone("82", "91259-4113");
		Cliente clienteFlavioR2 = new Cliente("Flavio Nunes", "123-351-526-42", enderecoClienteR2, telefoneClienteR2,
				"flavionunes@gmail.com", null, null);

		PagamentoCartao pagamentoCartaoR2 = new PagamentoCartao("13/10/2023", null, "1226 4515 5454 1252", "Credito");

		Reserva reserva2 = new Reserva("13/10/2023", listaQuartosR2, funcionarioPedroR1, clienteFlavioR2,
				pagamentoCartaoR2);

		pagamentoCartaoR2.setReserva(reserva2);

		// Gerente--------------------------------------------------------------------------------------------------------

		Endereco enderecoGerente = new Endereco("Agua Preta", "Morro do ingles", "Carvalhos", "48");
		Telefone telefoneGerente = new Telefone("81", "96554-4585");
		Gerente gerenteHotel = new Gerente("Gustavo", "444-555-666-77", enderecoGerente, telefoneGerente, "afd4fa6");

		// Hotel-----------------------------------------------------------------------------------------------

		ArrayList<Telefone> listaTelefonesHotel = new ArrayList<>(Arrays.asList(new Telefone("81", "94562-1156"),
				new Telefone("81", "95663-1595"), new Telefone("81", "9563-4568")));

		ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
		listaReservas.add(reserva1);

		Endereco enderecoHotel = new Endereco("Palmares", "Cohab 1", "Rua Z", "255");

		Hotel hotel = new Hotel("Palace Hotel", "12.345.678/0001-00", enderecoHotel, gerenteHotel, listaTelefonesHotel,
				listaReservas);

		// Apresentação
		// -------------------------------------------------------------------------------------------------------------------------------

		System.out.println("Hotel: " + hotel.getNome());
		System.out.println("Cnpj: " + hotel.getCnpj());
		System.out.println(
				"Cidade: " + hotel.getEndereco().getCidade() + 
				" ; Bairro: " + hotel.getEndereco().getBairro()+ 
				" ; Rua: " + hotel.getEndereco().getRua() + 
				" ; Num: " + hotel.getEndereco().getNumero());

		for (Telefone telefone : hotel.getListaTelefones()) {
			System.out.print("Telefones: " + "(" + telefone.getDdd() + ") " + telefone.getNumero());
			System.out.println();
		}
		
		hotel.mostrarInformacoesReservas();

		for (Reserva reserva : hotel.getListaReservas()) {
			reserva.getPagamento().calcularPagamento();

		}
	}
}
