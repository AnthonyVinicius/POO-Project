package com.hotel.sistema;

public abstract class Pagamento {

	// TODO : Revisar esses essa forma de pegar o metodo de pagamento
	
	protected int numQuartos ;
	protected double valorBase;
	protected String dataPagamento;
	protected String metodoPagamento;

	public Pagamento() {
		// TODO Auto-generated constructor stub]
		this.metodoPagamento = getClass().getSimpleName();
	}

	public Pagamento(String dataPagamento, int numQuartos) {
		super();
		this.valorBase = 125;
		this.dataPagamento = dataPagamento;
		this.metodoPagamento = getClass().getSimpleName();
		this.numQuartos = numQuartos;
	}

	protected abstract void calcularPagamento();

	public int getNumQuartos() {
		return numQuartos;
	}

	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}

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
