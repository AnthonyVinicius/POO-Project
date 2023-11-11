package com.hotel.sistema;

public class Servico {
	
	private String descricao;
	private Pagamento pagamento;
	
	public Servico() {
		// TODO Auto-generated constructor stub
	}
	
	public Servico(String descricao, Pagamento pagamento) {
		super();
		this.descricao = descricao;
		this.pagamento = pagamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}
