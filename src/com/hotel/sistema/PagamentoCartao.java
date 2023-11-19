
package com.hotel.sistema;

import java.security.InvalidParameterException;
import java.util.List;

public class PagamentoCartao extends Pagamento {

	private String tipoCartao;
	private String numero;

	private double valorFinal;

	public PagamentoCartao() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoCartao(String dataPagamento, Reserva reserva, String numero, String tipoCartao) {
		super(dataPagamento, reserva);
		this.numero = numero;
		this.tipoCartao = tipoCartao;
		this.valorFinal = 0;
	}

	// TODO: implementar uma forma de pegar o valor base da classe Pagamento e
	// calcular os juros somando com o valor base

	@Override
	public void calcularPagamento() {

		if (tipoCartao.equalsIgnoreCase("Debito")) {
			double somaTotal = 0;
			System.out.println("---------------------------------------------------");
			System.out.println("Cliente: " + reserva.getCliente().getNome());
			System.out.println("Cpf: " + reserva.getCliente().getCpf());
			System.out.println("Numero do cartão:" + getNumero());
			System.out.println("Tipo Cartão: " + getMetodoPagamento());

			for (Quarto quarto : reserva.getListaQuartos()) {
				System.out.printf("Quarto:---------R$%.2f\n", valorQuarto);
				somaTotal += valorQuarto;

				for (Cama cama : quarto.getCama()) {
					System.out.printf("Cama:------------R$%.2f\n", valorCama);
					somaTotal += valorCama;

				}
			}
			valorFinal = somaTotal - somaTotal * 0.03;
			System.out.printf("\nValor Bruto:-----R$%.2f", somaTotal);
			System.out.printf("\nValor Final:-----R$%.2f", valorFinal);
			System.out.println("\n--------------------------------------------------------------");

		} else if (tipoCartao.equalsIgnoreCase("Credito")) {
			double somaTotal = 0;
			System.out.println("---------------------------------------------------");
			System.out.println("Cliente: " + reserva.getCliente().getNome());
			System.out.println("Cpf: " + reserva.getCliente().getCpf());
			System.out.println("Numero do cartão:" + getNumero());
			System.out.println("Tipo Cartão: " + getMetodoPagamento());

			for (Quarto quarto : reserva.getListaQuartos()) {
				System.out.printf("Quarto:---------R$%.2f\n", valorQuarto);
				somaTotal += valorQuarto;

				for (Cama cama : quarto.getCama()) {
					System.out.printf("Cama:------------R$%.2f\n", valorCama);
					somaTotal += valorCama;

				}
			}
			valorFinal = somaTotal + somaTotal * 0.05;
			System.out.printf("\nValor Bruto:-----R$%.2f", somaTotal);
			System.out.printf("\nValor Final:-----R$%.2f", valorFinal);
			System.out.println("\n--------------------------------------------------------------");

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