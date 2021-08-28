package chain_of_responsibility;

import java.math.BigDecimal;

import domain.Orcamento;

public class SemDesconto extends CalculadoraDeDesconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
