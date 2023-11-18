package com.hotel.sistema;

import java.util.List;

public abstract class Pagamento {

	// TODO : Revisar esses essa forma de pegar o metodo de pagamento

	protected double valorQuarto;
	protected double valorCama;
	protected String dataPagamento;
	protected String metodoPagamento;
	protected List<Reserva> listaDeReservas;

	public Pagamento() {
		// TODO Auto-generated constructor stub]
		this.valorQuarto = 125;
		this.valorCama = 25;
		this.metodoPagamento = getClass().getSimpleName();
	}

	public Pagamento(String dataPagamento, List<Reserva> listaDeReservas) {
		super();
		this.valorQuarto = 125;
		this.valorCama = 25;
		this.dataPagamento = dataPagamento;
		this.metodoPagamento = getClass().getSimpleName();
		this.listaDeReservas = listaDeReservas;
	}
	// Assinatura
	protected abstract void calcularPagamento();

	public double getValorQuarto() {
		return valorQuarto;
	}

	public void setValorQuarto(double valorQuarto) {
		this.valorQuarto = valorQuarto;
	}

	public double getValorCama() {
		return valorCama;
	}

	public void setValorCama(double valorCama) {
		this.valorCama = valorCama;
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

