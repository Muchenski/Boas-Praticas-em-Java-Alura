package strategy;

import java.math.BigDecimal;

public class ICMSService implements CalculadoraDeImposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.1));
	}
}
