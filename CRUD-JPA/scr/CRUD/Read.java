package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class Read {
	public static void motrarPessoa(Long id) {
		if(id instanceof Long) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
			EntityManager em = emf.createEntityManager();
			
			Pessoa pessoa = em.find(Pessoa.class, id);
			
			System.out.println("ID: " + pessoa.getId());
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Sobrenome: " + pessoa.getSobrenome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("Email: " + pessoa.getEmail());
			System.out.println("Idade: " + pessoa.getIdade());
			
			em.close();
			emf.close();
		} else {
			System.out.println("O ID não é do tipo necessario para continuar a operação!");
		}
	}
}
