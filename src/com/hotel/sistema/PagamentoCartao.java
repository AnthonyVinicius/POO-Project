package com.hotel.sistema;

public class PagamentoCartao extends Pagamento {
	
	private String numero;
	private String tipoCartao;
	
	public PagamentoCartao() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoCartao(String numero, String tipoCartao) {
		super();
		this.numero = numero;
		this.tipoCartao = tipoCartao;
	}


// TODO: mplementar uma forma de pegar o valor base da classe Pagamento e calcular os juros somando com o valor base 
	

	public String getNumero() {
		return numero;
	}

	@Override
	public void calcularPagamento() {
		// TODO Auto-generated method stub
		super.calcularPagamento();
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
}
