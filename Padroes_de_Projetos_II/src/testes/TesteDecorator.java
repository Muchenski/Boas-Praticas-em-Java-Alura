package testes;

import java.math.BigDecimal;

import decorator.CalculadoraDeImpostoService;
import decorator.ICMSService;
import decorator.ISSService;
import decorator.Orcamento;

public class TesteDecorator {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal(100.0), 1);

		CalculadoraDeImpostoService calculadoraDeImpostoService = new CalculadoraDeImpostoService();

		System.out.println(calculadoraDeImpostoService.calcular(orcamento, new ICMSService()));

		System.out.println(calculadoraDeImpostoService.calcular(orcamento, new ISSService()));

		System.out.println(calculadoraDeImpostoService.calcular(orcamento, new ISSService(new ICMSService())));

		System.out.println(calculadoraDeImpostoService.calcular(orcamento, new ICMSService(new ISSService())));

	}

}
