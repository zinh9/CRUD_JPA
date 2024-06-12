# Projeto CRUD com JPA

Este projeto é um exemplo prático de um sistema CRUD (Create, Read, Update, Delete) utilizando JPA (Java Persistence API). Ele serve como uma demonstração de como aplicar conceitos de persistência de dados em Java usando JPA para operações básicas em um banco de dados.

## Descrição

O projeto consiste em uma aplicação Java que gerencia informações de pessoas (nome, sobrenome, CPF, email e idade) e realiza operações de inserção, leitura, atualização e exclusão dessas informações no banco de dados. Utiliza a especificação JPA para mapeamento objeto-relacional (ORM) e para gerenciamento das entidades.

## Estrutura do Projeto

### Pacote `modelo`

Contém a entidade `Pessoa` mapeada com as anotações JPA.

### Pacote CRUD

Contém as classes responsáveis pelas operações CRUD:

* Create: Classe para inserir novas pessoas no banco de dados.
* Read: Classe para ler informações de pessoas do banco de dados.
* Update: Classe para atualizar informações de pessoas no banco de dados.
* Delete: Classe para deletar pessoas do banco de dados.
* TesteCrud: Classe com o método main para interagir com o usuário e executar as operações CRUD.

## Conclusão

Este projeto foi desenvolvido para colocar em prática os conhecimentos de JPA adquiridos, incluindo mapeamento de entidades, gerenciamento de transações e operações CRUD básicas. É um ponto de partida para projetos mais complexos que envolvem persistência de dados em Java.
