package state;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;

	private Integer quantidadeItens;

	private OrcamentoState estado;

	@Deprecated
	private String situacao;

	public Orcamento(BigDecimal valor, Integer quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = "EM_ANALISE";
		this.estado = new OrcamentoEmAnaliseState();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// Com STATE:

	// Não utilizamos if's, e temos controle do que pode ou não ser feito no
	// orçamento, de acordo com o estado em que ele se encontra.

	public void aplicarDescontoExtra() {
		BigDecimal descontoExtra = this.estado.aplicarDescontoExtra(this);
		this.valor = this.valor.subtract(descontoExtra);
	}

	public void aprovar() {
		this.estado.aprovar(this);
	}

	public void reprovar() {
		this.estado.reprovar(this);
	}

	public void finalizar() {
		this.estado.finalizar(this);
	}

	public OrcamentoState getEstado() {
		return estado;
	}

	public void setEstado(OrcamentoState estado) {
		this.estado = estado;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// Sem STATE:

	// Os if's cresceriam a cada situação nova, para podermos definir um desconto
	// para o orçamento.
	// Além disso, precisaríamos de mais if's para controlar o que pode ou não ser
	// feito, dependendo da situação do orçamento.
	// Por exemplo, criar regras para não podermos setar um orçamento com situação
	// "APROVADO", se ele já está "APROVADO", dentre outras regras parecidas.

	@Deprecated
	public void aplicarDescontoExtraa() {
		BigDecimal descontoExtra = new BigDecimal(0.0);
		if (this.situacao.equals("EM_ANALISE")) {
			descontoExtra = new BigDecimal(0.05);
		} else if (this.situacao.equals("APROVADO")) {
			descontoExtra = new BigDecimal(0.02);
		}
		this.valor = this.valor.subtract(descontoExtra);
	}

	@Deprecated
	public void aprovarr() {
		this.situacao = "APROVADO";
	}

	@Deprecated
	public void reprovarr() {
		this.situacao = "REPROVADO";
	}

	@Deprecated
	public void finalizarr() {
		this.situacao = "FINALIZADO";
	}

	@Deprecated
	public String getSituacao() {
		return situacao;
	}

	@Deprecated
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

}
