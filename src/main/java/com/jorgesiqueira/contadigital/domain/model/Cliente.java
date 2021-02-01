package com.jorgesiqueira.contadigital.domain.model;

//1.	Cadastro da conta:
//a.	Campos: Nome completo, número do documento "cpf" , endereço completo e senha provisória;

public class Cliente {
	
	private Long id;
	private String nome;
	private String endereco;
	private String cpf;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
