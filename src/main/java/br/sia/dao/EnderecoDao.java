package br.sia.dao;

import br.sia.modelo.Endereco;
import br.sia.modelo.Pessoa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.TypedQuery;

public class EnderecoDao extends GenericDao implements Serializable {

	public EnderecoDao() {
        super(Endereco.class);
    }

	public List<Endereco> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Endereco.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
