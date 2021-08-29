package state;

public class OrcamentoReprovadoState extends OrcamentoState {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstado(new OrcamentoFinalizadoState());
	}

	@Override
	public String getNome() {
		return "Reprovado";
	}

}
