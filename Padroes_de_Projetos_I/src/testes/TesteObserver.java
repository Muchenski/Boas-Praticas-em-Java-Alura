package testes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import observer.AcaoAposGerarPedido;
import observer.EmailService;
import observer.GerarPedido;
import observer.GerarPedidoHandler;
import observer.PedidoRepository;

public class TesteObserver {

	public static void main(String[] args) {

		int quantidadePedido = 1;
		BigDecimal valorPedido = new BigDecimal(200.0);
		String cliente = "Henrique";

		GerarPedido gerarPedido = new GerarPedido(cliente, valorPedido, quantidadePedido);

		List<AcaoAposGerarPedido> listeners = new ArrayList<AcaoAposGerarPedido>();

		listeners.addAll(List.of(new PedidoRepository(), new EmailService()));

		GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(listeners);

		gerarPedidoHandler.gerar(gerarPedido);

	}

}
