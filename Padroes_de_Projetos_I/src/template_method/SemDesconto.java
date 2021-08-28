package template_method;

import java.math.BigDecimal;

import domain.Orcamento;

public class SemDesconto extends CalculadoraDeDesconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
