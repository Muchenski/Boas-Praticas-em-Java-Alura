package template_method;

import java.math.BigDecimal;

public class CalculadoraDeDescontoService {

	public BigDecimal calcular(Orcamento orcamento) {
		CalculadoraDeDesconto calculadoraDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItensService(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentosService(
						new SemDesconto()
				)
		);
		return calculadoraDeDesconto.calcular(orcamento);
	}

	// Este m�todo ir� crescer a cada possibilidade de desconto para ser aplicada.
	// Diferentemente do padr�o Strategy, neste caso, n�o sabemos qual crit�rio aplicaremos.
	// Ent�o � criada uma cadeia de possibilidades ligadas para descobrirmos.
	@Deprecated
	public BigDecimal calcularr(Orcamento orcamento) {
		BigDecimal desconto = new BigDecimal(0.0);
		if (orcamento.getQuantidadeItens() > 5) {
			desconto = new BigDecimal(0.1);
		}
		if (orcamento.getValor().compareTo(new BigDecimal(500.0)) > 0) {
			desconto = new BigDecimal(0.05);
		}
		return orcamento.getValor().multiply(new BigDecimal(desconto.doubleValue()));
	}

}
