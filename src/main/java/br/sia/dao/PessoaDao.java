package br.sia.dao;

import br.sia.modelo.Pessoa;
import java.util.List;
import javax.persistence.TypedQuery;

public class PessoaDao extends GenericDao {

	public PessoaDao() {
        super(Pessoa.class);
    }

	public List<Pessoa> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Pessoa.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
