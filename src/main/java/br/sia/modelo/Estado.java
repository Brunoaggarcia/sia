package br.sia.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbEstado")
public class Estado implements Serializable {
	
	@Id
	@Column(name = "cod_estado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codEstado;
	
	@Column(name = "descricao")
	private String nomeEstado;
	
	@Column(name = "sigla")
	private String sigla;
	
	public Estado (Long codEstado,String nomeEstado,String sigla){
		this.codEstado = codEstado;
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}
	
	public Estado(){
		
	}

	public Long getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Long codEstado) {
		this.codEstado = codEstado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
