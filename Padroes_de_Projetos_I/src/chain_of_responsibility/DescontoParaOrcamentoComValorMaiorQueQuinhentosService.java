package chain_of_responsibility;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentosService extends CalculadoraDeDesconto {

	public DescontoParaOrcamentoComValorMaiorQueQuinhentosService(CalculadoraDeDesconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal(500.0)) > 0) {
			return orcamento.getValor().multiply(new BigDecimal(0.05));
		}
		return proximo.calcular(orcamento);
	}

}