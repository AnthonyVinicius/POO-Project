package com.hotel.main;

import java.util.ArrayList;

import com.hotel.sistema.*;
import com.hotel.pessoa.*;

public class MainLuiz {
	public static void main(String[] args) {

		// Reserva_1_________________________________________________________________________________________________________________________________
		ArrayList<Quarto> listaQuartosR1 = new ArrayList<Quarto>();
		listaQuartosR1.add(new Quarto(11, new Cama("Simples")));
		listaQuartosR1.add(new Quarto(12, new Cama("Dupla")));

		Endereco enderecoPedro = new Endereco("Palmares", "Santa Rosa", "Mato bebo", "56");
		Telefone telefonePedro = new Telefone("81", "9-1111-2222");
		Funcionario funcionarioPedro = new Funcionario("Pedro", "25.654.54", enderecoPedro, telefonePedro, "Recepção");

		Endereco enderecoJorge = new Endereco("Agua Preta", "Da inchente", "Rua do barro", "25");
		Telefone telefoneJorge = new Telefone("81", "9-2222-1111");
		Cliente clienteJorge = new Cliente("Jorge", "12.568.95", enderecoJorge, telefoneJorge, "jorge157@gmail.com");

		// Passar a quantidade de quartos
		PagamentoCartao pagamentoJorge = new PagamentoCartao("12/11/2023",listaQuartosR1.size(),"4153 5969 4854 9585", "Debito");
		System.out.println("Valor final: " + pagamentoJorge.getValorFinal());

		Reserva reserva1 = new Reserva("12/11/2023", listaQuartosR1, funcionarioPedro, clienteJorge, pagamentoJorge);

		// Hotel: Palace Hotel

		ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
		listaReservas.add(reserva1);
		Endereco enderecoHotel = new Endereco("Palmares", "Cohab 1", "Rua Z", "255");
		Hotel hotel = new Hotel("Palace Hotel", enderecoHotel, listaReservas);

	}

}
