package testes;

import java.math.BigDecimal;

import strategy.CalculadoraDeImpostoService;
import strategy.ICMSService;
import strategy.ISSService;
import strategy.Orcamento;

public class TesteStrategy {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal(100.0), 1);

		CalculadoraDeImpostoService calculadoraDeImpostosService = new CalculadoraDeImpostoService();

		System.out.println(calculadoraDeImpostosService.calcular(orcamento, new ICMSService()));
		System.out.println(calculadoraDeImpostosService.calcular(orcamento, new ISSService()));
	}

}
