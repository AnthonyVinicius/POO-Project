package com.hotel.main;

import java.util.ArrayList;

import com.hotel.sistema.*;
import com.hotel.pessoa.*;

public class MainLuiz {
	public static void main(String[] args) {

		ArrayList<Quarto> listaQuartosR1 = new ArrayList<Quarto>();
		listaQuartosR1.add(new Quarto(11, new Cama("Simples")));
		listaQuartosR1.add(new Quarto(12, new Cama("Dupla")));
		
		Funcionario funcionario1 = new Funcionario();
		
//		Reserva reserva1 = new Reserva("12/11/2023", listaQuartosR1, null, null)

		// Hotel
		Endereco enderecoHotel = new Endereco("Palmares", "Cohab 1", "Rua Z", "255");
		Hotel hotel = new Hotel("Palace Hotel", enderecoHotel, null, null);

		listaQuartosR1.get(0).getCama();
	}

}
