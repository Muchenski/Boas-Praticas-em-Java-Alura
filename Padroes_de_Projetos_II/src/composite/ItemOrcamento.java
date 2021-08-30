package composite;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

	private BigDecimal valor;

	public ItemOrcamento() {
	}

	public ItemOrcamento(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ItemOrcamento [valor=" + valor + "]";
	}

}
