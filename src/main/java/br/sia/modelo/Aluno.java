package br.sia.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbAluno")
public class Aluno implements Serializable {
	
	@Id
	@Column(name = "ra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ra;
	
	@Column(name = "nome_pai")
	private String nomePai;
	
	@Column(name = "nome_mae")
	private String nomeMae;
	
	@Column(name = "status_matricula")
	@Enumerated(EnumType.STRING)
	private StatusMatricula statusMatricula;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_pessoa")
	private Pessoa pessoa;

	@Column(name = "senha")
	private String senha;
	
	public Aluno (Long ra,String nomePai,String nomeMae,StatusMatricula statusMatricula,Pessoa pessoa,String senha){
		this.ra = ra;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.statusMatricula = statusMatricula;
		this.pessoa = pessoa;
		this.senha = senha;
	}
	
	public Aluno() {
		
	}

	public Long getRa() {
		return ra;
	}

	public void setRa(Long ra) {
		this.ra = ra;
	}
	
	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public StatusMatricula getStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(StatusMatricula statusMatricula) {
		this.statusMatricula = statusMatricula;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
