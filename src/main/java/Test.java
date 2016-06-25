import br.sia.dao.PessoaDao;
import br.sia.modelo.Pessoa;

public class Test {
	
	public static void main (String[] args){
		Pessoa pessoa = new Pessoa();
		PessoaDao pessoadao = new PessoaDao();
		
		pessoa.setNome("Bruno");
		pessoadao.salvar(pessoa);
	}

}
