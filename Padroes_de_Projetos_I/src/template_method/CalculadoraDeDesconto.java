package template_method;

import java.math.BigDecimal;

import domain.Orcamento;

public abstract class CalculadoraDeDesconto {

	protected CalculadoraDeDesconto proximo;

	public CalculadoraDeDesconto(CalculadoraDeDesconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	protected abstract boolean deveAplicar(Orcamento orcamento);

	public CalculadoraDeDesconto getProximo() {
		return proximo;
	}

	public void setProximo(CalculadoraDeDesconto proximo) {
		this.proximo = proximo;
	}

}
