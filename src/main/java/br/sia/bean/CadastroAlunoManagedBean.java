package br.sia.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.sia.dao.ContatoDao;
import br.sia.dao.EnderecoDao;
import br.sia.dao.PessoaDao;
import br.sia.modelo.Aluno;
import br.sia.modelo.Contato;
import br.sia.modelo.Endereco;
import br.sia.modelo.Estado;
import br.sia.modelo.Pessoa;

@ManagedBean(name = "CadastroAlunoBean")
@ViewScoped
public class CadastroAlunoManagedBean {
	
	private Pessoa pessoa;
	private PessoaDao pessoadao;
	private Endereco endereco;
	private Aluno aluno;
	private Contato contato;
	private Estado estado;
	
	@PostConstruct
	public void init(){
		pessoa = new Pessoa();
		endereco = new Endereco();
		aluno = new Aluno();
		contato = new Contato();
		estado = new Estado();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void salvar(){
		pessoadao = new PessoaDao();
		pessoa.setEndereco(endereco);
		pessoa.setContato(contato);
		aluno.setPessoa(pessoa);
		pessoadao.salvar(pessoa);
		pessoadao.salvar(contato);
		pessoadao.salvar(endereco);
		pessoadao.salvar(aluno);
		pessoadao.salvar(estado);
		
	}

}
