package chain_of_responsibility;

import java.math.BigDecimal;

public class SemDesconto extends CalculadoraDeDesconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}