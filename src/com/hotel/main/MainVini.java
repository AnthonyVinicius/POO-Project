package com.hotel.main;

import java.util.ArrayList;
import com.hotel.sistema.*;
import com.hotel.pessoa.*;


public class MainVini {
	public static void main(String[] args) {
		ArrayList<Reserva> reservas = new ArrayList<Reserva>();
		//Funcionário
		Telefone telefoneF = new Telefone("81", "99762-6784");
		Endereco enderecoF = new Endereco("Recife", "Olinda", "Rua G", "450");
		Funcionario funcionario = new Funcionario("Fernando", "465.765.545-8", enderecoF, telefoneF, "fernando@gmail.com");
		funcionario.setSetor("Lobby");
		
		//Gerente
		Telefone telefoneG = new Telefone("81", "98093-3645");
		Endereco enderecoG = new Endereco("Palmares", "Água Preta", "Rua Z", "80");
		Gerente gerente = new Gerente("Lucas", "345.561.189-4", enderecoG, telefoneG, "1098-9");
		
		//Reserva 1
		ArrayList<Quarto> quartosR1 = new ArrayList<Quarto>();
		ArrayList<Cama> camasR1 = new ArrayList<Cama>();
		
		Telefone telefoneC1 = new Telefone("81", "97458-9123");
		Endereco enderecoC1 = new Endereco("Palmares", "Newton Carneiro", "Rua 25", "3");
		
		Cliente clienteR1 = new Cliente("Paulo", "234.345.567-8", enderecoC1, telefoneC1, "paulo@gmail.com", null, reservas);
	
		Cama camaR1 = new Cama("Simples");
		camasR1.add(camaR1);
		
		Cama cama1R1 = new Cama("Duplo");
		camasR1.add(cama1R1);
		
		Quarto quarto1 = new Quarto(10, camasR1);
		quartosR1.add(quarto1);
		
		Reserva reserva1 = new Reserva("20/12/2023", quartosR1, funcionario, clienteR1, null);

		//Reserva 2
		ArrayList<Quarto> quartosR2 = new ArrayList<Quarto>();
		ArrayList<Cama> camasR2 = new ArrayList<Cama>();
		
		Telefone telefoneC2 = new Telefone("81", "99876-4567");
		Endereco enderecoC2 = new Endereco("Palmares", "Nova Palmares", "Rua A", "7");
		
		Cliente clienteR2 = new Cliente("Vinicius", "776.546.345-78", enderecoC2, telefoneC2, "vini@gmail.com", null, reservas);
	
		Cama camaR2 = new Cama("Duplo");
		camasR2.add(camaR1);
		
		Cama cama1R2 = new Cama("Simples");
		camasR2.add(cama1R1);
		
		Quarto quarto2 = new Quarto(5, camasR2);
		quartosR2.add(quarto1);
		
		Reserva reserva2 = new Reserva("23/12/2023", quartosR2, funcionario, clienteR2, null);
		
		PagamentoCartao pagamento = new PagamentoCartao("23/12/2023", reserva2, "3456.5345.5465.3455", "Credito");

		//Hotel
		reservas.add(reserva1);
		reservas.add(reserva2);
		ArrayList<Telefone> TelefoneHotel = new ArrayList<Telefone>();
		
		Telefone telefoneH = new Telefone("81", "3661-0897");
		Endereco enderecoH = new Endereco("Palmares", "Centro", "Rua Letácio Montenegro", "145");
		
		Hotel hotel = new Hotel("Hotel Estrelas", "534.345.876.213", enderecoH, gerente, TelefoneHotel, reservas);
		

		int r = 1;
		for (Reserva reserva : clienteR1.getListasReservas()) {
			System.out.println(r + "°" + "Reserva: ");
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
			System.out.println("________________________________________________________________________");
			}
		}
		
		pagamento.calcularPagamento();
	}
}
