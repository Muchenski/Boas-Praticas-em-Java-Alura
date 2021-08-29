package adapter;

import java.util.Map;

public class RegistroDeOrcamento {

	// Parte de infra desacoplada da classe de registro de orçamento, e utilizando
	// polimorfismo.
	private HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {

		String url = "http://api.externa.com.br";

		Map<String, Object> data = Map.of("valor", orcamento.getValor(), "quantidadeItens",
				orcamento.getQuantidadeItens());

		http.post(url, data);
	}

}
