package service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

	public abstract BigDecimal getValor();

	public abstract LocalDate getData();

}
