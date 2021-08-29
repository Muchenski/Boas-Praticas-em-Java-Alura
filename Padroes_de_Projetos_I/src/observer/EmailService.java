package observer;

public class EmailService implements AcaoAposGerarPedido {

	@Override
	public void executarAposPedido(Pedido pedido) {
		notificarPedido(pedido);
	}

	public void notificarPedido(Pedido pedido) {
		System.out.println(String.format("Olá %s, seu pedido foi confirmado com sucesso!", pedido.getCliente()));
	}

}
