package com.hotel.sistema;

public abstract class Pagamento {

	// TODO : Revisar esses essa forma de pegar o metodo de pagamento

	protected double valorQuarto;
	protected double valorCama;
	
	protected String dataPagamento;
	protected String metodoPagamento;
	protected Reserva reserva;

	public Pagamento() {
		// TODO Auto-generated constructor stub]
		this.valorQuarto = 125;
		this.valorCama = 25;
		this.metodoPagamento = getClass().getSimpleName();
	}

	public Pagamento(String dataPagamento, Reserva reserva) {
		super();
		this.valorQuarto = 125;
		this.valorCama = 25;
		this.dataPagamento = dataPagamento;
		this.metodoPagamento = getClass().getSimpleName();
		this.reserva = reserva;
	}
	
	// Assinatura
	public abstract void calcularPagamento();

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

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}	
}