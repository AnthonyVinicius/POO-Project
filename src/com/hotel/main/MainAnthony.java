package com.hotel.main;
import com.hotel.sistema.*;
import java.util.ArrayList;
import java.util.List;
import com.hotel.pessoa.*;

public class MainAnthony {
	public static void main(String[] args) {
		
		Endereco enderecoClienteMarcos = new Endereco();
		enderecoClienteMarcos.setBairro("Centro");
		enderecoClienteMarcos.setCidade("Palmares");
		enderecoClienteMarcos.setRua("José Carlos de Almeida");
		enderecoClienteMarcos.setNumero("15");
		
		Telefone telefoneClienteMarcos = new Telefone();
		telefoneClienteMarcos.setDdd("81");
		telefoneClienteMarcos.setNumero("9-5656-9885");
		
		Cliente clienteMarcos = new Cliente();
		clienteMarcos.setNome("Marcos");
		clienteMarcos.setEmail("marcos@gmail.com");
		clienteMarcos.setRg("10.221.10");
		clienteMarcos.setEndereco(enderecoClienteMarcos);
		clienteMarcos.setTelefone(telefoneClienteMarcos);
		
	
		Endereco enderecoFuncionarioJoao = new Endereco();
		enderecoFuncionarioJoao.setBairro("Carneiros");
		enderecoFuncionarioJoao.setCidade("Caruaru");
		enderecoFuncionarioJoao.setRua("Almeida Filho");
		enderecoFuncionarioJoao.setNumero("02");
		
		Telefone telefoneFuncinarioJoao = new Telefone();
		telefoneFuncinarioJoao.setDdd("81");
		telefoneFuncinarioJoao.setNumero("9-2369-1523");
		
		Funcionario funcionarioJoao = new Funcionario();
		funcionarioJoao.setEndereco(enderecoFuncionarioJoao);
		funcionarioJoao.setTelefone(telefoneFuncinarioJoao);
		funcionarioJoao.setNome("João");
		funcionarioJoao.setRg("12.352.12");
		funcionarioJoao.setSetor("Recepção");

		Endereco enderecoGerenteCarlos = new Endereco();
		enderecoGerenteCarlos.setBairro("Madureira");
		enderecoGerenteCarlos.setCidade("Água Preta");
		enderecoGerenteCarlos.setRua("José Bispo");
		enderecoGerenteCarlos.setNumero("35");
		
		Telefone telefoneGerenteCarlos = new Telefone();
		telefoneGerenteCarlos.setDdd("81");
		telefoneGerenteCarlos.setNumero("9-1526-5767");
		
		Gerente gerenteCarlos = new Gerente();
		gerenteCarlos.setEndereco(enderecoGerenteCarlos);
		gerenteCarlos.setTelefone(telefoneGerenteCarlos);
		gerenteCarlos.setCodigoDeAcesso("131520");
		gerenteCarlos.setNome("Carlos");
		gerenteCarlos.setRg("12.351.21");
		
		Endereco enderecoHotelBeiraMar = new Endereco();
		enderecoHotelBeiraMar.setBairro("Vento Bravo");
		enderecoHotelBeiraMar.setCidade("Recife");
		enderecoHotelBeiraMar.setRua("Beira Mar");
		enderecoHotelBeiraMar.setNumero("154");
		
		Cama camaSimplesReserva1ClienteMarcos = new Cama();
		camaSimplesReserva1ClienteMarcos.setTipo("Simples");
		
		Cama camaDuplaReserva1ClienteMarcos = new Cama();
		camaDuplaReserva1ClienteMarcos.setTipo("Dupla");
		
		Quarto quarto1Reserva1ClienteMarcos = new Quarto();
		quarto1Reserva1ClienteMarcos.setCama(camaSimplesReserva1ClienteMarcos);
		quarto1Reserva1ClienteMarcos.setNumero(155);
		
		Quarto quarto2Reserva1ClienteMarcos = new Quarto();
		quarto2Reserva1ClienteMarcos.setCama(camaDuplaReserva1ClienteMarcos);
		quarto2Reserva1ClienteMarcos.setNumero(55);
		
		List <Quarto> listaQuartosReserva1ClienteMarcos = new ArrayList<Quarto>();
		listaQuartosReserva1ClienteMarcos.add(quarto1Reserva1ClienteMarcos);
		listaQuartosReserva1ClienteMarcos.add(quarto2Reserva1ClienteMarcos);
		
		PagamentoDinheiro pagamentoDinheiroReserva1ClienteMarcos = new PagamentoDinheiro();
		pagamentoDinheiroReserva1ClienteMarcos.setMetodoPagamento("Dinheiro");
		pagamentoDinheiroReserva1ClienteMarcos.setDataPagamento("12/12/2003");
		pagamentoDinheiroReserva1ClienteMarcos.setValorBase(250.00);
		
		Reserva reserva1ClienteMarcos = new Reserva();
		reserva1ClienteMarcos.setData("15/12/2003");
		reserva1ClienteMarcos.setCliente(clienteMarcos);
		reserva1ClienteMarcos.setFuncionario(funcionarioJoao);
		reserva1ClienteMarcos.setListaQuartos(listaQuartosReserva1ClienteMarcos);
		reserva1ClienteMarcos.setPagamento(pagamentoDinheiroReserva1ClienteMarcos);
		
//		Reserva 2 ___________________________________________________________________
		
		Cama camaSimples1Reserva2ClienteMarcos = new Cama();
		camaSimples1Reserva2ClienteMarcos.setTipo("Simples");
		
		Cama camaSimples2Reserva2ClienteMarcos = new Cama();
		camaSimples2Reserva2ClienteMarcos.setTipo("Simples");
		
		Quarto quarto1Reserva2ClienteMarcos = new Quarto();
		quarto1Reserva2ClienteMarcos.setCama(camaSimples1Reserva2ClienteMarcos);
		quarto1Reserva2ClienteMarcos.setNumero(166);
		
		Quarto quarto2Reserva2ClienteMarcos = new Quarto();
		quarto2Reserva2ClienteMarcos.setCama(camaSimples2Reserva2ClienteMarcos);
		quarto2Reserva2ClienteMarcos.setNumero(33);
		
		List <Quarto> listaQuartosReserva2ClienteMarcos = new ArrayList<Quarto>();
		listaQuartosReserva2ClienteMarcos.add(quarto1Reserva2ClienteMarcos);
		listaQuartosReserva2ClienteMarcos.add(quarto2Reserva2ClienteMarcos);
		
		PagamentoCartao pagamentoCartaoReserva2ClienteMarcos = new PagamentoCartao();
		pagamentoCartaoReserva2ClienteMarcos.setMetodoPagamento("Cartão");
		pagamentoCartaoReserva2ClienteMarcos.setDataPagamento("12/12/2003");
		pagamentoCartaoReserva2ClienteMarcos.setValorBase(300.00);
		pagamentoCartaoReserva2ClienteMarcos.setNumero("25125-1521-5505-4342");
		pagamentoCartaoReserva2ClienteMarcos.setTipoCartao("Credito");
		
		
		Reserva reserva2ClienteMarcos = new Reserva();
		reserva2ClienteMarcos.setData("15/12/2003");
		reserva2ClienteMarcos.setCliente(clienteMarcos);
		reserva2ClienteMarcos.setFuncionario(funcionarioJoao);
		reserva2ClienteMarcos.setListaQuartos(listaQuartosReserva2ClienteMarcos);
		reserva2ClienteMarcos.setPagamento(pagamentoCartaoReserva2ClienteMarcos);
		
		List <Reserva> listaReservasClienteMarcos = new ArrayList<Reserva>();
		listaReservasClienteMarcos.add(reserva1ClienteMarcos);
		listaReservasClienteMarcos.add(reserva2ClienteMarcos);
		
		Hotel HotelbeiraMar = new Hotel();
		HotelbeiraMar.setNome("Beira Mar");
		HotelbeiraMar.setEndereco(enderecoHotelBeiraMar);
		HotelbeiraMar.setListaReservas(listaReservasClienteMarcos);

	
		
	}
}
