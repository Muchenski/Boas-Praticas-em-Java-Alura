package command;

public class PedidoRepository {

	public void salvarPedido(Pedido pedido) {
		System.out.println(String.format("%s salvo com sucesso!", pedido));
	}

}
