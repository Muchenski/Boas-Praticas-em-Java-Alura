package decorator;

import java.math.BigDecimal;

public abstract class CalculadoraDeImposto {

	protected CalculadoraDeImposto outro;

	public CalculadoraDeImposto(CalculadoraDeImposto outro) {
		this.outro = outro;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal taxaImposto = this.efetuarCalculo(orcamento);
		BigDecimal taxaOutroImposto = new BigDecimal(0.0);
		if (this.outro != null) {
			taxaOutroImposto = this.outro.efetuarCalculo(orcamento);
		}
		return taxaImposto.add(taxaOutroImposto);
	}

	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

}
