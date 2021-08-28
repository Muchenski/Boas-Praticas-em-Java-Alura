package strategy;

import java.math.BigDecimal;

import domain.Orcamento;

public interface CalculadoraDeImposto {

	public abstract BigDecimal calcular(Orcamento orcamento);

}
