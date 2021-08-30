package model;

import java.math.BigDecimal;

public class Terceirizado /*extends Funcionario {

Esta heran�a iria deixar vis�vel m�todos de Funcion�rios que 
n�o deveriam ser vis�veis para Terceirizados. 
Al�m de que Terceirizados iriam poder ser passados como argumento em fun��es que apenas Funcion�rios deveriam.
Por isso utilizaremos composi��o para re�so de propriedades comuns.*/ {
	
	// Priorizando composi��o ao inv�s de heran�a.
	private DadosPessoais dadosPessoais;
	
	private String empresa;
	
	public Terceirizado() {
	}

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNome() {
		return dadosPessoais.getNome();
	}

	public String getCpf() {
		return dadosPessoais.getCpf();
	}

	public Cargo getCargo() {
		return dadosPessoais.getCargo();
	}

	public BigDecimal getSalario() {
		return dadosPessoais.getSalario();
	}
	
}
