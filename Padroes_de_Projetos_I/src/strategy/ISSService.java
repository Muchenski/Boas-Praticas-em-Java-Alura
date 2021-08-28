package strategy;

import java.math.BigDecimal;

import domain.Orcamento;

public class ISSService implements CalculadoraDeImposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.06));
	}

}
