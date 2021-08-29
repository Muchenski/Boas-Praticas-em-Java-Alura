package strategy;

import java.math.BigDecimal;

public class CalculadoraDeImpostoService {

	public BigDecimal calcular(Orcamento orcamento, CalculadoraDeImposto calculadoraDeImposto) {
		return calculadoraDeImposto.calcular(orcamento);
	}

	// Cada vez que surgir um TipoImposto, irá ter que surgir um novo else if.
	// Logo esta função pode crescer continuamente, o que se tornará um código
	// "poluído", dificultando a manutenção.
	// Nestes casos, o melhor a se fazer é criar classes "especializadas",
	// utilizando Interfaces, inversão de controle e injeção de dependência.
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
