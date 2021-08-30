package service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import exceptions.ValidacaoException;
import model.Funcionario;

public class ReajusteService {

	private List<ValidacaoReajuste> validacoesReajuste;

	public ReajusteService(List<ValidacaoReajuste> validacoesReajuste) {
		this.validacoesReajuste = validacoesReajuste;
	}

	public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoesReajuste.forEach(validacao -> validacao.validar(funcionario, aumento));
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal salarioReajustado = salarioAtual.add(aumento);
		funcionario.reajustarSalario(salarioReajustado);
	}

	@Deprecated
	public void reajustarSalarioFuncionarioo(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

		if (percentualReajuste.compareTo(new BigDecimal(0.4)) > 0) {
			throw new ValidacaoException("Reajuste não pode ser maior do que 40% do salário!");
		}

		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();

		long intervaloEmMesesDoUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

		if (intervaloEmMesesDoUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
		}

		BigDecimal salarioReajustado = salarioAtual.add(aumento);
		funcionario.reajustarSalario(salarioReajustado);
	}

	public void adicionarValidacao(ValidacaoReajuste validacaoReajuste) {
		this.validacoesReajuste.add(validacaoReajuste);
	}

	public void removerValidacao(ValidacaoReajuste validacaoReajuste) {
		this.validacoesReajuste.remove(validacaoReajuste);
	}

}
