package br.sia.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbContato")
public class Contato implements Serializable {
	
	@Id
	@Column(name = "cod_contato")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codContato;
	
	@Column(name = "telefone_residencial")
	private String telefoneResidencial;
	
	@Column(name = "telefone_comercial")
	private String telefoneComercial;
	
	@Column(name = "telefone_celular")
	private String telefoneCelular;
	
	public Contato(Long codContato, String telefoneResidencial, String telefoneComercial, String telefoneCelular){
		
		this.codContato = codContato;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneComercial = telefoneComercial;
		this.telefoneCelular = telefoneCelular;
	}

	public Contato(){
		
	}
	
	public Long getCodContato() {
		return codContato;
	}

	public void setCodContato(Long codContato) {
		this.codContato = codContato;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
}
