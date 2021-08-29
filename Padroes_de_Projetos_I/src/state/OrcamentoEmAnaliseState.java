package state;

import java.math.BigDecimal;

public class OrcamentoEmAnaliseState extends OrcamentoState {

	@Override
	public BigDecimal aplicarDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.05));
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setEstado(new OrcamentoAprovadoState());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setEstado(new OrcamentoReprovadoState());
	}

	@Override
	public String getNome() {
		return "Em análise";
	}
}
