package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class Delete {
	public static void deletarPessoa(Long id) {
		if(id instanceof Long) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
			EntityManager em = emf.createEntityManager();
			
			Pessoa pessoa = em.find(Pessoa.class, id);
			
			if(pessoa != null) {
				em.getTransaction().begin();
				em.remove(pessoa);
				em.getTransaction().commit();
				
			} else {
				System.out.println("A pessoa não está no banco de dados!");
			}
			
			em.close();
			emf.close();
		} else {
			System.out.println("O ID não é do tipo necessario para continuar a operação!");
		}
	}
}	
