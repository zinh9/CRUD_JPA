package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class Create {

	public static void inserirPessoa(String nome, String sobrenome, String cpf, String email, int idade) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = new Pessoa(nome, sobrenome, cpf, email, idade);
		
		if(pessoa != null) {
			em.getTransaction().begin();
			em.persist(pessoa);
			em.getTransaction().commit();
			
			System.out.println("Pessoa inserida com sucesso!");
		} else {
			System.out.println("Não foi possivel inserir a pessoa!");
		}
		
		
		em.close();
		emf.close();
	}

}
