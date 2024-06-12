package CRUD;

import modelo.Pessoa;
import infra.DAO;

public class Read {
	public static void motrarPessoa(Long id) {
		if(id instanceof Long) {
			DAO<Pessoa> dao = new DAO<Pessoa>(Pessoa.class);

			List<Pessoa> pessoas = dao.getAll();

			for(Pessoa pessoa : pessoas){
				if(pessoa.getId() == id){
					System.out.println("ID: " + pessoa.getId());
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Sobrenome: " + pessoa.getSobrenome());
					System.out.println("CPF: " + pessoa.getCpf());
					System.out.println("Email: " + pessoa.getEmail());
					System.out.println("Idade: " + pessoa.getIdade());
				} else {
					System.out.println("Pessoa não encontrada!");
				}
			}

			dao.close();
		} else {
			System.out.println("O ID não é do tipo necessario para continuar a operação!");
		}
	}
}
