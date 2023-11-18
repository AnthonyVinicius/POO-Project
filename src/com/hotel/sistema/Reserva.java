package com.hotel.sistema;

import java.util.List;

import com.hotel.pessoa.Cliente;
import com.hotel.pessoa.Funcionario;

public class Reserva {

	private String data;
	
	private Funcionario funcionario;
	private Cliente cliente;
	private Pagamento pagamento;
	private List<Quarto> listaQuartos;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(String data, List<Quarto> listaQuartos, Funcionario funcionario, Cliente cliente,
			Pagamento pagamento) {
		super();
		this.data = data;
		this.listaQuartos = listaQuartos;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public List<Quarto> getListaQuartos() {
		return listaQuartos;
	}

	public void setListaQuartos(List<Quarto> listaQuartos) {
		this.listaQuartos = listaQuartos;
	}
}
