
package com.hotel.sistema;

import java.security.InvalidParameterException;
import java.util.List;

public class PagamentoCartao extends Pagamento {

	private String numero;
	private String tipoCartao;
	private double valorFinal;
	

	public PagamentoCartao() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoCartao(List<Quarto>listaDeQuartos ,String dataPagamento, String numero, String tipoCartao) {
		super(listaDeQuartos,dataPagamento);
		this.numero = numero;
		this.tipoCartao = tipoCartao;
		this.valorFinal = 0.0;
	}

	// TODO: implementar uma forma de pegar o valor base da classe Pagamento e
	// calcular os juros somando com o valor base

	@Override
	protected void calcularPagamento() {
		
		valorBase *= listaDeQuartos.size();
		
		if (tipoCartao == "Debito") {
			valorFinal = valorBase * 1.05;
			setValorFinal(valorFinal);
			
		} else if (tipoCartao == "Credito") {
			valorFinal = valorBase * 1.02;
			setValorFinal(valorFinal);

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
