package CRUD;

import java.util.Scanner;

public class TesteCrud {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continuar = true;
		
		System.out.println("-------------------- Operação CRUD --------------------");
		
		while(continuar) {
			System.out.println("Digite uma das opções para operação CRUD:\n\n"
					+ "1) Criar uma nova pessoa\n2) Ver uma pessoa\n3) Atualizar uma pessoa\n"
					+ "4) Deletar uma pessoa\n5) Sair\n\nOpção: ");
			int opcao = in.nextInt();
			Long id;
			
			switch (opcao) {
			case 1:
				inserirDadosPessoa();
				
				break;
				
			case 2:
				id = inserirId();
				Read.motrarPessoa(id);
				
				break;
				
			case 3:
				id = inserirId();
				Update.atualizarPessoa(id);
				
				break;
			
			case 4:
				id = inserirId();
				Delete.deletarPessoa(id);
				
				break;
				
			case 5:
				continuar = false;
				
				break;
				
			default:
				break;
			}
		}
	}
	
	public static void inserirDadosPessoa() {
		Scanner in = new Scanner(System.in);
		String nome, sobrenome, cpf, email;
		int idade;
		
		System.out.println("Digite o nome: ");
		nome = in.nextLine();
		
		System.out.println("Digite o sobrenome: ");
		sobrenome = in.nextLine();
		
		System.out.println("Digite o CPF: ");
		cpf = in.nextLine();
		
		System.out.println("Digite o email: ");
		email = in.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = in.nextInt();
		
		Create.inserirPessoa(nome, sobrenome, cpf, email, idade);
	}
	
	public static Long inserirId() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o ID da pessoa: ");
		Long id = in.nextLong();
		
		return id;
	}

}
