package br.sia.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.sia.modelo.Estado;
import br.sia.modelo.Pessoa;

public class EstadoDao extends GenericDao implements Serializable  {

	public EstadoDao() {
        super(Estado.class);
    }

	public List<Estado> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Estado.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
