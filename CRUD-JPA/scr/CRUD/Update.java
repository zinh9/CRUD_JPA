package CRUD;

import java.util.Scanner;

import modelo.Pessoa;
import infra.DAO;

public class Update {
	public static void atualizarPessoa(Long id) {
		if(id instanceof Long) {
			Scanner in = new Scanner(System.in);

			DAO<Pessoa> dao = new DAO<Pessoa>(Pessoa.class);
			
			System.out.println("Digite uma das opções que deseja atualizar:\n\n"
					+ "1) Nome\n2) Sobrenome\n3) CPF\n4) Email\n5) Idade\n\n"
					+ "Opção: ");
			int opcao = in.nextInt();
			in.nextLine();
						
			Pessoa pessoa = em.find(Pessoa.class, id);
			
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
			
			dao.openTransaction().update(pessoa).closeTransaction();
			
			System.out.println("Pessoa atualizada com sucesso!");
			
		} else {
			System.out.println("O ID não é do tipo necessario para continuar a operação!");
		}
	}
}
