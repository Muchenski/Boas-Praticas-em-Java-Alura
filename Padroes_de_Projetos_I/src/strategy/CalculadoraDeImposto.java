package strategy;

import java.math.BigDecimal;

public interface CalculadoraDeImposto {

	public abstract BigDecimal calcular(Orcamento orcamento);

}
