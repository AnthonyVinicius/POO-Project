package com.hotel.sistema;

import java.util.List;

public class PagamentoDinheiro extends Pagamento {

	private double valorFinal;

	public PagamentoDinheiro() {
		super();
		this.valorFinal = 0;
	}

	public PagamentoDinheiro(String dataPagamento, List<Reserva> listaDeReservas) {
		super(dataPagamento, listaDeReservas);
		this.valorFinal = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	// TODO: Resolver esses B.O
	public void calcularPagamento() {
		double somaTotal = 0;
		for (Reserva reserva : listaDeReservas) {
			System.out.println("---------------------------------------------------");
			System.out.println("Cliente: " + reserva.getCliente().getNome());
			System.out.println("Cpf: " + reserva.getCliente().getCpf());

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
		}
	}

	public double getValorFinal() {
		calcularPagamento();
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
}