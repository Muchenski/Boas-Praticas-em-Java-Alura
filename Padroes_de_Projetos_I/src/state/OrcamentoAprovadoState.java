package state;

import java.math.BigDecimal;

public class OrcamentoAprovadoState extends OrcamentoState {

	@Override
	public BigDecimal aplicarDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.02));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstado(new OrcamentoFinalizadoState());
	}

	@Override
	public String getNome() {
		return "Aprovado";
	}
}
