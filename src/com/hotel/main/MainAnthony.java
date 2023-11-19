 package com.hotel.main;
 
import com.hotel.sistema.*;
import java.util.ArrayList;
import java.util.List;
import com.hotel.pessoa.*;

public class MainAnthony {
	public static void main(String[] args) {
		
		List<Cama> camas1 = new ArrayList<Cama>();
		List<Cama> camas2 = new ArrayList<Cama>();
		
		List<Quarto> quartos1 = new ArrayList<Quarto>();
		List<Quarto> quartos2 = new ArrayList<Quarto>();
		
		List<Reserva> reservas = new ArrayList<Reserva>();
		
		List<Pagamento> pagamentos = new ArrayList<Pagamento>();
		
		List<Telefone> telefones = new ArrayList<>();
		
		Endereco enderecoCarlos = new Endereco("Caruaru","Olinda", "Rua a", "21B");
		Telefone telefoneCarlos  = new Telefone("18","4445-4232");
		Funcionario carlos = new Funcionario("Carlos", "123-546-424-44", enderecoCarlos, telefoneCarlos, "Recepção");
		
		Endereco enderecoMarcos = new Endereco("Recife","Centro", "Rua s", "2A");
		Telefone telefoneMarcos  = new Telefone("81","8805-9932");
		Gerente marcos = new Gerente("Marcos", "344-543-443-55", enderecoMarcos, telefoneMarcos, "5t36re");
		
		Endereco enderecoJoao = new Endereco("Palmares","Nova Palmares", "Rua Z", "23B");
		Telefone telefoneJoao  = new Telefone("18","1233-4232");
		Cliente joaoCliente = new Cliente("Joao", "123-456-789-00",enderecoJoao, telefoneJoao, "joao@gmail.com",pagamentos, reservas);
		
		PagamentoCartao cartaoJoao = new PagamentoCartao();
		PagamentoDinheiro dinheiroJoao = new PagamentoDinheiro();
		
		Cama cama1Quarto1Joao = new Cama("Simples");
		Cama cama2Quarto1Joao = new Cama("Simples");
		camas1.add(cama1Quarto1Joao);
		camas1.add(cama2Quarto1Joao);
		Quarto quarto1Joao = new Quarto(10, camas1);
		quartos1.add(quarto1Joao);
		Reserva reserva1Joao = new Reserva("10/12/2015", quartos1, carlos, joaoCliente, cartaoJoao);
		reservas.add(reserva1Joao);
		
		Cama cama1Quarto2Joao = new Cama("Dupla");
		camas2.add(cama1Quarto2Joao);
		Quarto quarto2Joao = new Quarto(12, camas2);
		quartos2.add(quarto2Joao);
		Reserva reserva2Joao = new Reserva("15/12/2015", quartos2, carlos, joaoCliente, dinheiroJoao);
		reservas.add(reserva2Joao);
		
		cartaoJoao.setDataPagamento("15/12/2015");
		cartaoJoao.setNumero("1234-4124-4213");
		cartaoJoao.setTipoCartao("Credito");
		cartaoJoao.setReserva(reserva1Joao);
		pagamentos.add(cartaoJoao);
		
		dinheiroJoao.setDataPagamento("12032015");
		dinheiroJoao.setReserva(reserva2Joao);
		pagamentos.add(dinheiroJoao);
		
		Telefone telefone1BeiraMar = new Telefone("18","3661-4232");
		Telefone telefone2BeiraMar  = new Telefone("18","3661-4237 ");
		telefones.add(telefone1BeiraMar);
		telefones.add(telefone2BeiraMar);
		
		Endereco enderecoBeiraMar = new Endereco("Recife","Centro", "Rua X", "1444");
		Hotel beiraMar = new Hotel("BeiraMar", "12.345.678/0001-00", enderecoBeiraMar, marcos, telefones, reservas);
		
		dinheiroJoao.calcularPagamento();
		
		cartaoJoao.calcularPagamento();
		
		System.out.println("Hotel:" + beiraMar.getNome());
				
		int r = 1;
		for (Reserva elementoReserva : reservas) {
			System.out.println(r + "°" + "Reserva: ");
			System.out.println("Data: " + elementoReserva.getData());
			System.out.println("Funcionario responsalvel: " + elementoReserva.getFuncionario().getNome());
			System.out.println("Setor: " + elementoReserva.getFuncionario().getSetor());
			System.out.println("Cliente: " + elementoReserva.getCliente().getNome());
			r++;

			int q = 1;
			for (Quarto quarto : elementoReserva.getListaQuartos()) {
				System.out.println(q + "°" + "Quarto");
				System.out.println("Num: " + quarto.getNumero());
				q++;
				
				for (Cama cama : quarto.getCama()) {
					System.out.println("Cama: " + cama.getTipo());
				}
				
			System.out.println("________________________________________________________________________");
			}
		}
	}
}



