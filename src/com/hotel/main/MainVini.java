package com.hotel.main;

import java.util.ArrayList;
import com.hotel.sistema.*;
import com.hotel.pessoa.*;


public class MainVini {
	public static void main(String[] args) {
		ArrayList<Quarto> quartos = new ArrayList<Quarto>();
		ArrayList<Reserva> reservas = new ArrayList<Reserva>();
		ArrayList<Cama> camas = new ArrayList<Cama>();
		ArrayList<Telefone> TelefoneHotel = new ArrayList<Telefone>();
		
		Telefone telefoneC = new Telefone("81", "99876-4567");
		Endereco enderecoC = new Endereco("Palmares", "Nova Palmares", "Rua A", "7");
		
		Telefone telefoneF = new Telefone("81", "99762-6784");
		Endereco enderecoF = new Endereco("Recife", "Olinda", "Rua G", "450");
		
		Telefone telefoneG = new Telefone("81", "98093-3645");
		Endereco enderecoG = new Endereco("Palmares", "Água Preta", "Rua Z", "80");
		
		Telefone telefoneH = new Telefone("81", "3661-0897");
		Endereco enderecoH = new Endereco("Palmares", "Centro", "Rua Letácio Montenegro", "145");
		
		Cliente cliente = new Cliente("Paulo", "234.345.567-8", enderecoC, telefoneC, "paulo@gmail.com", null, reservas);
		
		Funcionario funcionario = new Funcionario("Fernando", "465.765.545-8", enderecoF, telefoneF, "fernando@gmail.com");
		funcionario.setSetor("Lobby");
		
		Gerente gerente = new Gerente("Lucas", "345.561.189-4", enderecoG, telefoneG, "1098-9");
		
		Cama cama = new Cama("Simples");
		camas.add(cama);
		
		Quarto quarto = new Quarto(10, camas);
		quartos.add(quarto);
		
		Reserva reserva = new Reserva("20/12/2023", quartos, funcionario, cliente, null);
		reservas.add(reserva);
		
		Hotel hotel = new Hotel("Hotel Estrelas", "534.345.876.213", enderecoH, gerente, TelefoneHotel, reservas);
		
		hotel.mostrarInformacoesReservas();
		
	}
}
