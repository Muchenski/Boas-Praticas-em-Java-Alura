package command;

public class EmailService {

	public void notificarPedido(Pedido pedido) {
		System.out.println(String.format("Ol� %s, seu pedido foi confirmado com sucesso!", pedido.getCliente()));
	}

}
