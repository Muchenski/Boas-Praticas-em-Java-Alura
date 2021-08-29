package observer;

import java.time.LocalDateTime;
import java.util.List;

// Classe que irá realizar todos processos necessários para gerar, e ao gerar um pedido.
public class GerarPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;

	public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void gerar(GerarPedido gerarPedido) {
		Orcamento orcamento = new Orcamento(gerarPedido.getValor(), gerarPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(gerarPedido.getCliente(), LocalDateTime.now(), orcamento);
		acoes.forEach(acao -> acao.executarAposPedido(pedido));
	}

}
