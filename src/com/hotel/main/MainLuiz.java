package com.hotel.main;

import java.util.ArrayList;
import java.util.Arrays;

import com.hotel.sistema.*;
import com.hotel.pessoa.*;

public class MainLuiz {
	public static void main(String[] args) {

		// Reserva_1_________________________________________________________________________________________________________________________________
		Endereco enderecoFuncionarioR1 = new Endereco("Palmares", "Cohab II", "Rua dos Carneiros", "126");
		Telefone telefoneFuncionarioR1 = new Telefone("81", "99626-5968");
		Funcionario funcionarioPedroR1 = new Funcionario("Pedro Herique ", "111-222-333-44", enderecoFuncionarioR1,
				telefoneFuncionarioR1, "Recepção");

		ArrayList<Quarto> listaQuartosR1 = new ArrayList<Quarto>();
		listaQuartosR1.add(new Quarto(11, new ArrayList<>(Arrays.asList(new Cama("Dupla")))));
		listaQuartosR1.add(new Quarto(12, new ArrayList<>(Arrays.asList(new Cama("Simples"), new Cama("Simples")))));

		Endereco enderecoClienteR1 = new Endereco("Recife", "Boa Viagem", "Machado 98", "68");
		Telefone telefoneClienteR1 = new Telefone("81", "98568-4513");
		Cliente clienteLuizR1 = new Cliente("Luiz Gabriel", "999-888-777-66", enderecoClienteR1, telefoneClienteR1,
				"luizgabriel@gmail.com", null, null);
		
		PagamentoDinheiro pagamentoDinheiroR1 = new PagamentoDinheiro("12/11/2023", null);
		
		Reserva reserva1 = new Reserva("12/11/2023", listaQuartosR1, funcionarioPedroR1, clienteLuizR1,pagamentoDinheiroR1);

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

		hotel.mostrarInformacoesReservas();

		pagamentoDinheiroR1.setListaDeReservas(listaReservas);
		pagamentoDinheiroR1.calcularPagamento();
	}
}
