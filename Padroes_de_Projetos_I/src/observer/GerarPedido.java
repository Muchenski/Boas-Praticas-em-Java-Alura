package observer;

import java.math.BigDecimal;

// Classe que receberá todos dados necessários para gerar pedidos.
public class GerarPedido {

	private String cliente;

	private BigDecimal valor;

	private Integer quantidadeItens;

	public GerarPedido(String cliente, BigDecimal valor, Integer quantidadeItens) {
		this.cliente = cliente;
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

}
