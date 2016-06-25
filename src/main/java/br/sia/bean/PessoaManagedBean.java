package br.sia.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.sia.dao.PessoaDao;
import br.sia.modelo.Pessoa;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaManagedBean {
	
	private Pessoa pessoa;
	private PessoaDao pessoadao;
	
	@PostConstruct
	public void init(){
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public void salvar(){
		pessoadao = new PessoaDao();
		pessoadao.salvar(pessoa);
	}
}
