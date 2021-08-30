package testes;

import java.math.BigDecimal;
import java.util.Date;

import proxy.ItemOrcamento;
import proxy.Orcamento;
import proxy.OrcamentoProxy;

public class TesteProxy {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItemOrcavel(new ItemOrcamento(new BigDecimal(1000.0)));
		orcamento.adicionarItemOrcavel(new ItemOrcamento(new BigDecimal(1000.0)));

		new Thread(new Runnable() {
			@Override
			public void run() {
				testaGetValorSemProxy(orcamento); // Sem Proxy - Tempo total: 8 segundos.
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				testaGetValorComProxy(orcamento); // Com Proxy - Tempo total: 2 segundos.
			}
		}).start();

	}

	private static void testaGetValorSemProxy(Orcamento orcamento) {
		Date inicioTeste = new Date();

		orcamento.getValor();
		orcamento.getValor();
		orcamento.getValor();
		orcamento.getValor();

		System.out.println(
				"Sem Proxy - Tempo total: " + ((new Date().getTime() - inicioTeste.getTime())) / 1000 + " segundos.");
	}

	private static void testaGetValorComProxy(Orcamento orcamento) {
		Date inicioTeste = new Date();

		OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamento);
		orcamentoProxy.getValor();
		orcamentoProxy.getValor();
		orcamentoProxy.getValor();
		orcamentoProxy.getValor();

		System.out.println(
				"Com Proxy - Tempo total: " + ((new Date().getTime() - inicioTeste.getTime()) / 1000) + " segundos.");
	}

}
