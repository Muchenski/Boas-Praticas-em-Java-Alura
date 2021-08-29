package observer;

public class PedidoRepository implements AcaoAposGerarPedido {

	@Override
	public void executarAposPedido(Pedido pedido) {
		salvarPedido(pedido);
	}

	public void salvarPedido(Pedido pedido) {
		System.out.println(String.format("%s salvo com sucesso!", pedido));
	}

}
