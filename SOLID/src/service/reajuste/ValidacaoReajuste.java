package service.reajuste;

import java.math.BigDecimal;

import model.Funcionario;

public interface ValidacaoReajuste {

	public abstract void validar(Funcionario funcionario, BigDecimal aumento);
}
