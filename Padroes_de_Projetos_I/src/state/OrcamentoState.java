package state;

import java.math.BigDecimal;

public abstract class OrcamentoState {

	public abstract String getNome();

	public BigDecimal aplicarDescontoExtra(Orcamento orcamento) {
		throw new IllegalStateException(
				"O or�amento n�o pode ter desconto extra! Estado atual: " + orcamento.getEstado().getNome());
	}

	public void aprovar(Orcamento orcamento) {
		throw new IllegalStateException(
				"O or�amento n�o pode ser aprovado! Estado atual: " + orcamento.getEstado().getNome());
	}

	public void reprovar(Orcamento orcamento) {
		throw new IllegalStateException(
				"O or�amento n�o pode ser reprovado! Estado atual: " + orcamento.getEstado().getNome());
	}

	public void finalizar(Orcamento orcamento) {
		throw new IllegalStateException(
				"O or�amento n�o pode ser finalizado! Estado atual: " + orcamento.getEstado().getNome());
	}
}
