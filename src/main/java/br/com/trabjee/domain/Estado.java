package br.com.trabjee.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vbn_estado")
public class Estado extends BaseEntity {

	@Column(name = "nome")
	private String nome;

	@Column(name = "sigla")
	private String sigla;

	public Estado() {
	}

	public Estado(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
