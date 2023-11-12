package com.hotel.main;

import java.util.ArrayList;
import com.hotel.sistema.*;
import com.hotel.pessoa.*;


public class MainVini {
	public static void main(String[] args) {
		ArrayList<Quarto> quartosReserva = new ArrayList<Quarto>();
		
		Telefone telefone = new Telefone("81", "99876-4567");
		Endereco endereco = new Endereco("Palmares", "Nova Palmares", "Rua A", "7");
		
		Telefone telefoneF = new Telefone("81", "97757-6784");
		Endereco enderecoF = new Endereco("Recife", "Olinda", "Rua Z", "450");
		
		Cliente cliente = new Cliente("Paulo", "123.456.789-0", endereco, telefone, "paulo@gmail.com");
		Funcionario funcionario = new Funcionario("Fernando", "465.765.545-8", enderecoF, telefoneF, "fernando@gmail.com");
		funcionario.setSetor("Lobby");
		
		Cama cama = new Cama("Simples");
		Quarto quarto = new Quarto(1, cama);
		Hotel hotel = new Hotel();
		
	}
}
