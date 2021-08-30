package proxy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

	private BigDecimal valor;

	private List<Orcavel> itensOrcaveis;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itensOrcaveis = new ArrayList<Orcavel>();
	}

	@Override
	public BigDecimal getValor() {
		// Simulando chamada lenta para API externa para obter os valores.
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<Orcavel> getItensOrcaveis() {
		return itensOrcaveis;
	}

	public Integer getQuantidadeItens() {
		return itensOrcaveis.size();
	}

	public void adicionarItemOrcavel(Orcavel itemOrcavel) {
		this.valor = this.valor.add(itemOrcavel.getValor());
		this.itensOrcaveis.add(itemOrcavel);
	}

	@Override
	public String toString() {
		return "Orcamento [valor=" + valor + ", itensOrcaveis=" + itensOrcaveis + "]";
	}

}
