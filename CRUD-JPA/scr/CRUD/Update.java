package CRUD;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class Update {
	public static void atualizarPessoa(Long id) {
		if(id instanceof Long) {
			Scanner in = new Scanner(System.in);
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
			EntityManager em = emf.createEntityManager();
			
			System.out.println("Digite uma das opções que deseja atualizar:\n\n"
					+ "1) Nome\n2) Sobrenome\n3) CPF\n4) Email\n5) Idade\n\n"
					+ "Opção: ");
			int opcao = in.nextInt();
			in.nextLine();
			
			em.getTransaction().begin();
			
			Pessoa pessoa = em.find(Pessoa.class, id);
			em.detach(pessoa);
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o novo nome: ");
				String nome = in.nextLine();
				
				pessoa.setCpf(nome);
				
				break;
				
			case 2:
				System.out.println("Digite o novo sobrenome: ");
				String sobrenome = in.nextLine();
				
				pessoa.setSobrenome(sobrenome);
				
				break;
			
			case 3:
				System.out.println("Digite o novo CPF: ");
				String cpf = in.nextLine();
				
				pessoa.setCpf(cpf);
				
				break;
				
			case 4:
				System.out.println("Digite o novo email: ");
				String email = in.nextLine();
				
				pessoa.setEmail(email);
				
				break;
				
			case 5:
				System.out.println("Digite a nova idade: ");
				int idade = in.nextInt();
				
				pessoa.setId(id);
				
				break;
				
			default:
				break;
			}
			
			em.merge(pessoa);
			
			em.getTransaction().commit();
			
			System.out.println("Pessoa atualizada com sucesso!");
			
		} else {
			System.out.println("O ID não é do tipo necessario para continuar a operação!");
		}
	}
}
