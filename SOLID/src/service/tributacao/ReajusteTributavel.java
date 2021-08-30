package service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {

	public abstract BigDecimal valorImpostoDeRenda();

}
