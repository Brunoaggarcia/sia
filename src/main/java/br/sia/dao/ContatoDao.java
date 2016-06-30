package br.sia.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.sia.modelo.Aluno;
import br.sia.modelo.Contato;

public class ContatoDao extends GenericDao implements Serializable  {

	public ContatoDao() {
        super(Contato.class);
    }

	public List<Contato> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Contato.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
