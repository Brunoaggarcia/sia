package br.sia.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.sia.modelo.Aluno;

public class AlunoDao extends GenericDao implements Serializable  {

	public AlunoDao() {
        super(Aluno.class);
    }

	public List<Aluno> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Aluno.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
