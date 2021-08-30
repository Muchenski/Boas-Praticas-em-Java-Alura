package testes;

import java.math.BigDecimal;
import java.util.Arrays;

import composite.ItemOrcamento;
import composite.Orcamento;

public class TesteComposite {

	public static void main(String[] args) {

		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItemOrcavel(new ItemOrcamento(new BigDecimal(100.0)));
		orcamentoAntigo.adicionarItemOrcavel(new ItemOrcamento(new BigDecimal(100.0)));
		orcamentoAntigo.adicionarItemOrcavel(new ItemOrcamento(new BigDecimal(100.0)));

		Orcamento orcamentoNovo = new Orcamento();
		orcamentoNovo.adicionarItemOrcavel(new ItemOrcamento(new BigDecimal(200.0)));

		// Queremos reaproveitar os itens que foram adicionados no orçamento antigo.

		orcamentoNovo.adicionarItemOrcavel(orcamentoAntigo);

		System.out.println(orcamentoNovo.getValor()); // 500

		// [ItemOrcamento [valor=200], Orcamento [valor=300, itensOrcaveis=[ItemOrcamento [valor=100], ItemOrcamento [valor=100], ItemOrcamento [valor=100]]]]
		System.out.println(Arrays.toString(orcamentoNovo.getItensOrcaveis().toArray()));
	}

}
