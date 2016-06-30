package br.sia.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.sia.modelo.Pessoa;

public class PessoaDao extends GenericDao implements Serializable  {


	private static final long serialVersionUID = -7742479806055415888L;

	public PessoaDao() {
        super(Pessoa.class);
    }

	public List<Pessoa> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Pessoa.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
