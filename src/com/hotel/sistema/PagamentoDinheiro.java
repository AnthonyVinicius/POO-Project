	package com.hotel.sistema;
	
	public class PagamentoDinheiro extends Pagamento {
		
		private double valorFinal;
	
		public PagamentoDinheiro() {
			super();
			// TODO Auto-generated constructor stub
		}

		public PagamentoDinheiro(String dataPagamento) {
			super(dataPagamento);
			this.valorFinal = 0;
			// TODO Auto-generated constructor stub
		}

		// TODO: implementar uma forma de pegar o valor base da classe Pagamento
		@Override
		protected void calcularPagamento() {
			
			valorBase *= listaDeQuartos.size();
			valorFinal = valorBase * 1.05;
			setValorFinal(valorFinal);
	
		}

		public double getValorFinal() {
			calcularPagamento();
			return valorFinal;
		}

		public void setValorFinal(double valorFinal) {
			this.valorFinal = valorFinal;
		}
	}
