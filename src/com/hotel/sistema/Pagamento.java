package com.hotel.sistema;

import java.util.List;

public abstract class Pagamento {

	// TODO : Revisar esses essa forma de pegar o metodo de pagamento

	protected double valorBase;
	protected String dataPagamento;
	protected String metodoPagamento;
	protected List<Reserva> listaDeReservas;

	public Pagamento() {
		// TODO Auto-generated constructor stub]
		this.valorBase = 125;
		this.metodoPagamento = getClass().getSimpleName();
	}

	public Pagamento(List<Quarto> listaDeQuartos, String dataPagamento, List<Reserva> listaDeReservas) {
		super();
		this.valorBase = 125;
		this.dataPagamento = dataPagamento;
		this.metodoPagamento = getClass().getSimpleName();
		this.listaDeReservas = listaDeReservas;
	}
	// Assinatura
	protected abstract void calcularPagamento();

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public List<Reserva> getListaDeReservas() {
		return listaDeReservas;
	}

	public void setListaDeReservas(List<Reserva> listaDeReservas) {
		this.listaDeReservas = listaDeReservas;
	}
}
