package template_method;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentosService extends CalculadoraDeDesconto {

	public DescontoParaOrcamentoComValorMaiorQueQuinhentosService(CalculadoraDeDesconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.05));
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal(500.0)) > 0;
	}

}
