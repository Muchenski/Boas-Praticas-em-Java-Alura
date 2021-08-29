package decorator;

import java.math.BigDecimal;

@Deprecated
public class ICMSComISSService /* implements CalculadoraDeImposto */ {

	// Para cada combinação iríamos ter que instanciar mais objetos e criar mais
	// métodos;

	@Deprecated
	// @Override
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal taxa = new BigDecimal(0.0);
		taxa.add(new ICMSService().calcular(orcamento));
		taxa.add(new ISSService().calcular(orcamento));
		return taxa;
	}

}
