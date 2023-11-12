package com.hotel.main;

import java.util.ArrayList;

import com.hotel.sistema.Cama;
import com.hotel.sistema.Endereco;
import com.hotel.sistema.Hotel;
import com.hotel.sistema.Quarto;
import com.hotel.sistema.Reserva;

public class MainLuiz {
	public static void main(String[] args) {
		
		System.out.println("Main Luiz");
		
		ArrayList<Quarto> listaQuartosR1 = new ArrayList<Quarto>();
		listaQuartosR1.add(new Quarto(11, new Cama("Simples")));
		
		ArrayList<Quarto> listaQuartosR2 = new ArrayList<Quarto>();
		listaQuartosR2.add(new Quarto(12, new Cama("Dupla")));
		
		Reserva reserva1 = new Reserva();
		
		Endereco enderecoHotel = new Endereco("Palmares", "Cohab 1", "Rua Z", "255");
		
		Hotel hotel = new Hotel("Palace Hotel", enderecoHotel, null, null);
		
		listaQuartosR1.get(0).getCama();
	}

}
