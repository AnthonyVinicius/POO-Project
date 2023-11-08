package com.hotel.sistema;

public class Servico {
	
	private String discricao;
	private Pagamento pagamento;
	
	public Servico() {
		// TODO Auto-generated constructor stub
	}
	
	public Servico(String discricao, Pagamento pagamento) {
		super();
		this.discricao = discricao;
		this.pagamento = pagamento;
	}

	public String getDiscricao() {
		return discricao;
	}

	public void setDiscricao(String discricao) {
		this.discricao = discricao;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}
