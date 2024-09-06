# regular-api 

---

# Projeto de Gestão de Multas de Trânsito

Este projeto é uma API desenvolvida em Spring Boot para gerenciar multas de trânsito. Ele utiliza um banco de dados PostgreSQL que roda em um container Docker. A documentação da API está disponível através do Swagger, onde você pode visualizar e testar os endpoints.

## Pré-requisitos

- Docker Desktop instalado
- JDK 11 ou superior
- Maven

## Configuração do Banco de Dados

O banco de dados é gerenciado via Docker. Certifique-se de ter o Docker instalado e configurado em sua máquina.

1. **Inicie o container do PostgreSQL:**

   O projeto inclui um arquivo `docker-compose.yml` que configura o banco de dados PostgreSQL. Para iniciar o container certifique-se de estar no mesmo diretório do arquivo e execute o seguinte comando no diretório raiz do projeto:

   ```bash
   docker-compose up -d
   ```

   Isso irá iniciar o PostgreSQL em segundo plano. O banco de dados incluirá as seguintes tabelas:

    - **Violation**: Contém informações sobre as violações (descrição, valor, classificação, fator).
    - **Ticket**: Registra as multas emitidas (data de ocorrência, referência ao veículo e à violação).
    - **Driver**: Armazena os dados dos motoristas (CPF, nome, número de registro).
    - **Vehicle**: Mantém os dados dos veículos (modelo, placa, tipo, renavam, proprietário).

2. **Configuração do Banco de Dados no Spring Boot:**

   Verifique se as configurações de conexão ao banco de dados no arquivo `application.properties` ou `application.yml` estão corretas. Certifique-se de que o nome de usuário, senha e URL de conexão correspondem ao banco de dados PostgreSQL iniciado no Docker.

   Exemplo de configuração:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/regular
   spring.datasource.username=bpaiva
   spring.datasource.password=senha
   spring.jpa.hibernate.ddl-auto=update
   ```


## Documentação da API

A documentação da API está disponível via Swagger. Após iniciar a aplicação, você pode acessar a documentação através do seguinte link:

```url
http://localhost:8080/swagger-ui.html
```

Aqui você poderá visualizar todos os endpoints disponíveis e testá-los diretamente na interface do Swagger.

## Testes

Certifique-se de que o banco de dados está rodando e que a aplicação foi iniciada. Em seguida, você pode usar o Swagger para testar os endpoints, ou pode usar ferramentas como Postman e cURL.