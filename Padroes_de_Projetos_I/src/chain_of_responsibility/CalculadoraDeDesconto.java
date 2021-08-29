package chain_of_responsibility;

import java.math.BigDecimal;

public abstract class CalculadoraDeDesconto {

	protected CalculadoraDeDesconto proximo;

	public CalculadoraDeDesconto(CalculadoraDeDesconto proximo) {
		this.proximo = proximo;
	}

	public abstract BigDecimal calcular(Orcamento orcamento);

	public CalculadoraDeDesconto getProximo() {
		return proximo;
	}

	public void setProximo(CalculadoraDeDesconto proximo) {
		this.proximo = proximo;
	}

}