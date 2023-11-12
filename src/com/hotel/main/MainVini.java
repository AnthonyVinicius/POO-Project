package com.hotel.main;

import java.util.ArrayList;
import com.hotel.sistema.*;
import com.hotel.pessoa.*;


public class MainVini {
	public static void main(String[] args) {
		ArrayList<Quarto> quartosReserva = new ArrayList<Quarto>();
		ArrayList<Reserva> reservas = new ArrayList<Reserva>();
		
		Telefone telefone = new Telefone("81", "99876-4567");
		Endereco endereco = new Endereco("Palmares", "Nova Palmares", "Rua A", "7");
		
		Telefone telefoneF = new Telefone("81", "97757-6784");
		Endereco enderecoF = new Endereco("Recife", "Olinda", "Rua Z", "450");
		
		Cliente cliente = new Cliente("Paulo", "123.456.789-0", endereco, telefone, "paulo@gmail.com");
		Funcionario funcionario = new Funcionario("Fernando", "465.765.545-8", enderecoF, telefoneF, "fernando@gmail.com");
		funcionario.setSetor("Lobby");
		
		Cama cama = new Cama("Simples");
		Quarto quarto = new Quarto(1, cama);
		quartosReserva.add(quarto);
		
		PagamentoCartao pagCart = new PagamentoCartao();
		pagCart.setDataPagamento("12/11/2023");
		pagCart.setMetodoPagamento("Débito");
		pagCart.setNumero("5345 4353 3453 6757");
		pagCart.setTipoCartao("MasterCard");
		pagCart.setValorBase(100);
		
		Reserva reserva = new Reserva();
		reserva.setCliente(cliente);
		reserva.setFuncionario(funcionario);
		reserva.setListaQuartos(quartosReserva);
		reserva.setPagamento(pagCart);
		reservas.add(reserva);
		
		Hotel hotel = new Hotel();
		hotel.setNome("Hotel Estrelas");
		hotel.setListaReservas(reservas);
		
		//incompleto(lembrar de serviços)
		
	}
}
