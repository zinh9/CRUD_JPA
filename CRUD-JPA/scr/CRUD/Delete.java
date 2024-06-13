package CRUD;

import modelo.Pessoa;
import infra.DAO;

public class Delete {
	public static void deletarPessoa(Long id) {
		if(id instanceof Long) {
			DAO<Pessoa> dao = new DAO<Pessoa>(Pessoa.class);
			
			Pessoa pessoa = em.find(Pessoa.class, id);
			
			if(pessoa != null) {
				dao.delete(pessoa).close();
				
			} else {
				System.out.println("A pessoa não está no banco de dados!");
			}
		} else {
			System.out.println("O ID não é do tipo necessario para continuar a operação!");
		}
	}
}	
