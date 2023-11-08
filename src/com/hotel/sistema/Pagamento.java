package com.hotel.sistema;

public abstract class Pagamento {

	// TODO : Revisar esses essa forma de pegar o metodo de pagamento

	protected double valorBase;
	protected String dataPagamento;
	protected String metodoPagamento;

	public Pagamento() {
		// TODO Auto-generated constructor stub
	}

	public Pagamento(double valorBase, String dataPagamento) {
		super();
		this.valorBase = valorBase;
		this.dataPagamento = dataPagamento;
		this.metodoPagamento = getClass().getSimpleName();
	}

	public abstract void calcularPagamento();

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
}
