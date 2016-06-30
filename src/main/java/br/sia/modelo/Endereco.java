package br.sia.modelo;

import java.io.Serializable;
import java.security.PublicKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbEndereco")
public class Endereco implements Serializable {
	
	@Id
	@Column(name = "cod_endereco")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codEndereco;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cep")
	private String cep;
	
	public Endereco(Long codEndereco,String endereco,String complemento,String bairro,String cep){
		this.codEndereco = codEndereco;
		this.endereco = endereco;
		this.complemento = complemento;
		this.cep = cep;
	}

	public Endereco(){
		
	}
	
	public Long getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Long codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
