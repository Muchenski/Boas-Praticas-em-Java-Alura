package command;

import java.time.LocalDateTime;

// Classe que irá realizar todos processos necessários para gerar, e ao gerar um pedido.
public class GerarPedidoHandler {

	private EmailService emailService;

	private PedidoRepository pedidoRepository;

	public GerarPedidoHandler(EmailService emailService, PedidoRepository pedidoRepository) {
		this.emailService = emailService;
		this.pedidoRepository = pedidoRepository;
	}

	public void gerar(GerarPedido gerarPedido) {
		Orcamento orcamento = new Orcamento(gerarPedido.getValor(), gerarPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(gerarPedido.getCliente(), LocalDateTime.now(), orcamento);
		pedidoRepository.salvarPedido(pedido);
		emailService.notificarPedido(pedido);
	}

}
