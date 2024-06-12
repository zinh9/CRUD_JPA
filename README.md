# Projeto CRUD com JPA

Este projeto é um exemplo prático de um sistema CRUD (Create, Read, Update, Delete) utilizando JPA (Java Persistence API). Ele serve como uma demonstração de como aplicar conceitos de persistência de dados em Java usando JPA para operações básicas em um banco de dados.

## Descrição

O projeto consiste em uma aplicação Java que gerencia informações de pessoas (nome, sobrenome, CPF, email e idade) e realiza operações de inserção, leitura, atualização e exclusão dessas informações no banco de dados. Utiliza a especificação JPA para mapeamento objeto-relacional (ORM) e para gerenciamento das entidades.

## Estrutura do Projeto

### Pacote `modelo`

Contém a entidade `Pessoa` mapeada com as anotações JPA.

### Pacote `CRUD`

Contém as classes responsáveis pelas operações CRUD:

* Create: Classe para inserir novas pessoas no banco de dados.
* Read: Classe para ler informações de pessoas do banco de dados.
* Update: Classe para atualizar informações de pessoas no banco de dados.
* Delete: Classe para deletar pessoas do banco de dados.
* TesteCrud: Classe com o método main para interagir com o usuário e executar as operações CRUD.

### Pacote `infra`

Este é um código Java que implementa um Objeto de Acesso a Dados Genérico (DAO) utilizando a API de Persistência do Java (JPA). Ele fornece funcionalidades básicas de CRUD (Create, Read, Update, Delete) para qualquer tipo de entidade.

#### Funcionalidades:

1. Operações CRUD: Suporta inserção, recuperação, atualização e exclusão de entidades no banco de dados.

2. Transações Atômicas: Permite agrupar múltiplas operações em uma única transação para garantir atomicidade.

3. Gestão de Entidades: Gerencia entidades utilizando o `EntityManager` da JPA para sincronização adequada com o contexto de persistência.

4. Inicialização Automática: Inicializa automaticamente o `EntityManagerFactory` para garantir eficiência na conexão com o banco de dados.

5. Limpeza de Recursos: Fecha o `EntityManager` e o `EntityManagerFactory` para liberar recursos do banco de dados quando não são mais necessários.

## Conclusão

Este projeto foi desenvolvido para colocar em prática os conhecimentos de JPA adquiridos, incluindo mapeamento de entidades, gerenciamento de transações e operações CRUD básicas. É um ponto de partida para projetos mais complexos que envolvem persistência de dados em Java.
