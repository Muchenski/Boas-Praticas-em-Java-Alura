package command;

public class EmailService {

	public void notificarPedido(Pedido pedido) {
		System.out.println(String.format("Olá %s, seu pedido foi confirmado com sucesso!", pedido.getCliente()));
	}

}
