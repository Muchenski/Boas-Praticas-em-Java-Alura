package chain_of_responsibility;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItensService extends CalculadoraDeDesconto {

	public DescontoParaOrcamentoComMaisDeCincoItensService(CalculadoraDeDesconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal(0.1));
		}
		return proximo.calcular(orcamento);
	}

}