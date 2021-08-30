package service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import exceptions.ValidacaoException;
import model.Funcionario;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

	@Override
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

		if (percentualReajuste.compareTo(new BigDecimal(0.4)) > 0) {
			throw new ValidacaoException("Reajuste não pode ser maior do que 40% do salário!");
		}
	}
}
