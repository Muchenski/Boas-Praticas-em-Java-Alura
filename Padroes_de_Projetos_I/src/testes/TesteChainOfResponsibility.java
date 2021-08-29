package testes;

import java.math.BigDecimal;

import chain_of_responsibility.CalculadoraDeDescontoService;
import chain_of_responsibility.Orcamento;

public class TesteChainOfResponsibility {

	public static void main(String[] args) {

		Orcamento orcamentoComDescontoPorQuantidade = new Orcamento(new BigDecimal(200.0), 6);

		Orcamento orcamentoComDescontoPorValor = new Orcamento(new BigDecimal(1000.0), 1);

		Orcamento orcamentoSemDesconto = new Orcamento(new BigDecimal(200.0), 5);

		Orcamento orcamentoComDescontoPorValorEQuantidade = new Orcamento(new BigDecimal(1000.0), 6);

		CalculadoraDeDescontoService calculadoraDeDescontoService = new CalculadoraDeDescontoService();

		System.out.println(calculadoraDeDescontoService.calcular(orcamentoComDescontoPorQuantidade));
		System.out.println(calculadoraDeDescontoService.calcular(orcamentoComDescontoPorValor));
		System.out.println(calculadoraDeDescontoService.calcular(orcamentoSemDesconto));
		System.out.println(calculadoraDeDescontoService.calcular(orcamentoComDescontoPorValorEQuantidade));

	}

}
