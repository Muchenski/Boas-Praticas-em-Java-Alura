package template_method;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItensService extends CalculadoraDeDesconto {

	public DescontoParaOrcamentoComMaisDeCincoItensService(CalculadoraDeDesconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.1));
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
