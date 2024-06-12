package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import infra.DAO;
import modelo.Pessoa;

public class Create {

	public static void inserirPessoa(String nome, String sobrenome, String cpf, String email, int idade) {
		DAO<Pessoa> dao = new DAO<Pessoa>(Pessoa.class);
		
		Pessoa pessoa = new Pessoa(nome, sobrenome, cpf, email, idade);
		
		if(pessoa != null) {
			dao.insertAtomic(pessoa);
			
			System.out.println("Pessoa inserida com sucesso!");
		} else {
			System.out.println("Não foi possivel inserir a pessoa!");
		}

		dao.close();
	}

}
