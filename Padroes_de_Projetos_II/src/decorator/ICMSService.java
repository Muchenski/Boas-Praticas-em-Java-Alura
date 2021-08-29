package decorator;

import java.math.BigDecimal;

public class ICMSService extends CalculadoraDeImposto {

	public ICMSService() {
		super(null);
	}

	public ICMSService(CalculadoraDeImposto proxima) {
		super(proxima);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.1));
	}
}
