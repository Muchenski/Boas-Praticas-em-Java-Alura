package testes;

import java.math.BigDecimal;

import state.Orcamento;

public class TesteState {

	public static void main(String[] args) {

		testaFinalizarEmOrcamentoEmAnalise(); // O or�amento n�o pode ser finalizado! Estado atual: Em an�lise

		newLine();

		testaAprovarEmOrcamentoReprovado(); // O or�amento n�o pode ser aprovado! Estado atual: Reprovado

		newLine();

		testaReprovarEmOrcamentoAprovado(); // O or�amento n�o pode ser reprovado! Estado atual: Aprovado

		newLine();

		testaAplicarDescontoExtraEmOrcamentoReprovado(); // O or�amento n�o pode ter desconto extra! Estado atual: Reprovado

		newLine();

		testaAplicarDescontoExtraEmOrcamentoFinalizado(); // O or�amento n�o pode ter desconto extra! Estado atual: Finalizado

		newLine();
		
		Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);

		System.out.println(orcamento.getEstado().getNome()); // Em an�lise
		
		orcamento.aplicarDescontoExtra();
		
		System.out.println(orcamento.getValor()); // 950
		
		orcamento.aprovar();
		
		System.out.println(orcamento.getEstado().getNome()); // Aprovado
		
		orcamento.aplicarDescontoExtra();
		
		System.out.println(orcamento.getValor()); // 930
	}

	// Caminho com erros:
	
	public static void testaFinalizarEmOrcamentoEmAnalise() {
		try {
			Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
			orcamento.finalizar();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void testaAprovarEmOrcamentoReprovado() {
		try {
			Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
			orcamento.reprovar();
			orcamento.aprovar();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void testaReprovarEmOrcamentoAprovado() {
		try {
			Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
			orcamento.aprovar();
			orcamento.reprovar();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void testaAplicarDescontoExtraEmOrcamentoReprovado() {
		try {
			Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
			orcamento.reprovar();
			orcamento.aplicarDescontoExtra();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void testaAplicarDescontoExtraEmOrcamentoFinalizado() {
		try {
			Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
			orcamento.aprovar();
			orcamento.finalizar();
			orcamento.aplicarDescontoExtra();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void newLine() {
		System.out.println();
	}
}
