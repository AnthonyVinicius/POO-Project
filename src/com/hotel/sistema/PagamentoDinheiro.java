package com.hotel.sistema;

import java.util.List;

public class PagamentoDinheiro extends Pagamento {

	private double valorFinal;

	public PagamentoDinheiro() {
		super();
		this.valorFinal = 0;
	}
	
	public PagamentoDinheiro(List<Quarto> listaDeQuartos, String dataPagamento, List<Reserva> listaDeReservas) {
		super(listaDeQuartos, dataPagamento, listaDeReservas);
		this.valorFinal = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	//TODO: Resolver esses B.O
	protected void calcularPagamento() {
		valorBase *= listaDeReservas
		valorFinal = valorBase * 1.05;
		setValorFinal(valorFinal);
	}

	public double getValorFinal() {
		calcularPagamento();
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
}
