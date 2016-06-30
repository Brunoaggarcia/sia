package br.sia.modelo;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbPessoa")
public class Pessoa  implements  Serializable{
    

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_pessoa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codPessoa;

	@Column(name = "nome")
	private String nome;

	@Column(name = "rg")
	private String rg;

	@Column(name = "cpf")
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Column(name = "nacionalidade")
	private String nacionalidade;

	@Column(name="estado_civil")
	private String estadoCivil;
	
	@Column(name = "profissao")
	private String profissao;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_endereco")
	private Endereco endereco;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_contato")
	private Contato contato;
	
	public Pessoa (Long codPessoa,String nome,String rg, String cpf,Date dataNascimento,Date dataCadastro,Sexo sexo,String nacionalidade,String estadoCivil,
					String profissao,Endereco endereco,Contato contato){
		this.codPessoa = codPessoa;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataCadastro;
		this.dataCadastro = dataCadastro;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Long getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
