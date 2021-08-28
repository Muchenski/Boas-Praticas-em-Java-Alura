package testes;

import java.math.BigDecimal;

import domain.Orcamento;
import strategy.CalculadoraDeImpostoService;
import strategy.ICMSService;
import strategy.ISSService;

public class TesteStrategy {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal(100.0), 1);

		CalculadoraDeImpostoService calculadoraDeImpostosService = new CalculadoraDeImpostoService();

		System.out.println(calculadoraDeImpostosService.calcular(orcamento, new ICMSService()));
		System.out.println(calculadoraDeImpostosService.calcular(orcamento, new ISSService()));
	}

}
