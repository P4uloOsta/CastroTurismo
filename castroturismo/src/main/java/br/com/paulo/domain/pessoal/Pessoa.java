package br.com.paulo.domain.pessoal;

import java.io.Serializable;

import br.com.paulo.local.Cidade;

public abstract class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String nome;
	
	private String TelefoneCelular;
	
	private String email;
	
	private String logradouro;
	
	private String complemento;
	
	private Integer numero;
	
	private Cidade cidade;
	
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneCelular() {
		return TelefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		TelefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * 
	 */
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
