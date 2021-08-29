package command;

import java.time.LocalDateTime;

public class Pedido {

	private String cliente;

	private LocalDateTime momento;

	private Orcamento orcamento;

	public Pedido(String cliente, LocalDateTime momento, Orcamento orcamento) {
		this.cliente = cliente;
		this.momento = momento;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

}
