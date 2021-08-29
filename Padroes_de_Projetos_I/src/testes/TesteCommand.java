package testes;

import java.math.BigDecimal;

import command.EmailService;
import command.GerarPedido;
import command.GerarPedidoHandler;
import command.PedidoRepository;

public class TesteCommand {

	public static void main(String[] args) {

		int quantidadePedido = 1;
		BigDecimal valorPedido = new BigDecimal(200.0);
		String cliente = "Henrique";

		GerarPedido gerarPedido = new GerarPedido(cliente, valorPedido, quantidadePedido);

		GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(new EmailService(), new PedidoRepository());

		gerarPedidoHandler.gerar(gerarPedido);

	}

}
