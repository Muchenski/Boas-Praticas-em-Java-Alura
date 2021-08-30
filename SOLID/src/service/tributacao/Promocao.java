package service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {

	private BigDecimal valor;

	private LocalDate data;

	public Promocao() {
	}

	public Promocao(BigDecimal valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
	}

	@Override
	public BigDecimal getValor() {
		return valor;
	}

	@Override
	public LocalDate getData() {
		return data;
	}

	@Override
	public BigDecimal valorImpostoDeRenda() {
		return valor.multiply(new BigDecimal(0.1));
	}
}
