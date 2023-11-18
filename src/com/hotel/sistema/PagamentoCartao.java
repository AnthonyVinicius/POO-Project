
package com.hotel.sistema;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class PagamentoCartao extends Pagamento {

	private String numero;
	private String tipoCartao;
	private double valorFinal;

	public PagamentoCartao() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoCartao(String dataPagamento, List<Reserva> listaDeReservas, String numero, String tipoCartao) {
		super(dataPagamento, listaDeReservas);
		this.numero = numero;
		this.tipoCartao = tipoCartao;
		this.valorFinal = 0;
	}

	// TODO: implementar uma forma de pegar o valor base da classe Pagamento e
	// calcular os juros somando com o valor base

	@Override
	protected void calcularPagamento() {

		if (tipoCartao == "Debito") {
			double somaTotal = 0;
			ArrayList<Double> todosOsValores = new ArrayList<Double>();
			for (Reserva reserva : listaDeReservas) {
				System.out.println("---------------------------------------------------");
				System.out.println("Cliente: " + reserva.getCliente().getNome());
				System.out.println("Cpf: " + reserva.getCliente().getCpf());

				for (Quarto quarto : reserva.getListaQuartos()) {
					System.out.println("Quarto : " + valorQuarto);
					somaTotal += valorQuarto;

					for (Cama cama : quarto.getCama()) {
						System.out.println("Cama : " + valorCama);
						somaTotal += valorCama;

					}
				}
				valorFinal = somaTotal - somaTotal * 0.03;
				System.out.println("Total: " + valorFinal);
				System.out.println("--------------------------------------------------------------");
			}

		} else if (tipoCartao == "Credito") {
			double somaTotal = 0;
			ArrayList<Double> todosOsValores = new ArrayList<Double>();
			for (Reserva reserva : listaDeReservas) {
				System.out.println("---------------------------------------------------");
				System.out.println("Cliente: " + reserva.getCliente().getNome());
				System.out.println("Cpf: " + reserva.getCliente().getCpf());

				for (Quarto quarto : reserva.getListaQuartos()) {
					System.out.println("Quarto : " + valorQuarto);
					somaTotal += valorQuarto;

					for (Cama cama : quarto.getCama()) {
						System.out.println("Cama : " + valorCama);
						somaTotal += valorCama;

					}
				}
				valorFinal = somaTotal + somaTotal * 0.05;
				System.out.println("Total: " + valorFinal);
				System.out.println("--------------------------------------------------------------");
			}
		} else {
			throw new InvalidParameterException("Tipo de Cartão invalido , tente novamente");
		}

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public double getValorFinal() {
		calcularPagamento();
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
}
