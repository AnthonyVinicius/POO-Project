package com.hotel.main;

import java.util.ArrayList;

import com.hotel.sistema.Endereco;
import com.hotel.sistema.Hotel;
import com.hotel.sistema.Quarto;
import com.hotel.sistema.Reserva;

public class MainLuiz {
	public static void main(String[] args) {
		
		ArrayList<Quarto> listaQuartosR1 = new ArrayList<Quarto>();
		
		Reserva reserva1 = new Reserva("12/11/2023",Quarto);
		
		Endereco enderecoHotel = new Endereco("Palmares", "Cohab 1", "Rua Z", "255");
		Hotel hotel = new Hotel("Palace Hotel", enderecoHotel, null, null);
		
	}

}
