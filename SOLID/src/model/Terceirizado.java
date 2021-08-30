package model;

import java.math.BigDecimal;

public class Terceirizado /*extends Funcionario {

Esta herança iria deixar visível métodos de Funcionários que 
não deveriam ser visíveis para Terceirizados. 
Além de que Terceirizados iriam poder ser passados como argumento em funções que apenas Funcionários deveriam.
Por isso utilizaremos composição para reúso de propriedades comuns.*/ {
	
	// Priorizando composição ao invés de herança.
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
