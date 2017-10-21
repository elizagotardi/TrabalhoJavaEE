package br.com.trabjee.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vbn_proposta")
public class Proposta extends BaseEntity {

	@Column(name = "cliente")
	private Cliente cliente;
	
	@Column(name = "renda")
	private BigDecimal renda;
	
	@Column(name = "motivo")
	private String motivo;
	
	@Column(name = "situacao")
	private String situacao;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getRenda() {
		return renda;
	}

	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
