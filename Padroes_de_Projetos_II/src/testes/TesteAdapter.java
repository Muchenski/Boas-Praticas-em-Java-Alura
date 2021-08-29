package testes;

import java.math.BigDecimal;

import adapter.MyHttpClient;
import adapter.Orcamento;
import adapter.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal(100.0), 1);

		RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new MyHttpClient());

		registroDeOrcamento.registrar(orcamento);

	}

}
