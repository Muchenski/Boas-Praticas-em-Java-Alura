package decorator;

import java.math.BigDecimal;

public class ISSService extends CalculadoraDeImposto {

	public ISSService() {
		super(null);
	}

	public ISSService(CalculadoraDeImposto proxima) {
		super(proxima);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.06));
	}

}
