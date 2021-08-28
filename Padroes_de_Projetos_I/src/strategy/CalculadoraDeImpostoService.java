package strategy;

import java.math.BigDecimal;

import domain.Orcamento;

public class CalculadoraDeImpostoService {

	public BigDecimal calcular(Orcamento orcamento, CalculadoraDeImposto calculadoraDeImposto) {
		return calculadoraDeImposto.calcular(orcamento);
	}

	// Cada vez que surgir um TipoImposto, ir� ter que surgir um novo else if.
	// Logo esta fun��o pode crescer continuamente, o que se tornar� um c�digo
	// "polu�do", dificultando a manuten��o.
	// Nestes casos, o melhor a se fazer � criar classes "especializadas",
	// utilizando Interfaces, invers�o de controle e inje��o de depend�ncia.
	@Deprecated
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		BigDecimal taxa = new BigDecimal(0.0);
		if (tipoImposto == TipoImposto.ICSM) {
			taxa = new BigDecimal(0.1);
		} else if (tipoImposto == TipoImposto.IMS) {
			taxa = new BigDecimal(0.06);
		}
		return orcamento.getValor().multiply(new BigDecimal(taxa.doubleValue()));
	}

}
