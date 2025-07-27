# 🚀 API REST Java para Treinamento

Projeto de uma API REST desenvolvida em Java para fins de treinamento em desenvolvimento back-end.

![Java](https://img.shields.io/badge/Java-17-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.5-green.svg)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue.svg)

## 🔧 Funcionalidades Implementadas
- CRUD completo de entidades de domínio
- Autenticação via JWT (JSON Web Tokens)
- Validação de dados de entrada
- Documentação com OpenAPI/Swagger
- Testes unitários básicos

## 🛠️ Tecnológicas
- **Linguagem**: Java 17
- **Framework**: Spring Boot 3
- **Banco de Dados**: PostgreSQL
- **Bibliotecas Principais**:
  - Spring Data JPA
  - Spring Security
  - Lombok
  - MapStruct
  - Hibernate Validator

## Pré-requisitos
- Java 17 JDK
- Maven 3.8+
- PostgreSQL 15+

## 🚀 Como Executar
### Configuração
1. Configure o banco de dados no arquivo `application.yml`
2. Execute as migrations do Flyway:
```bash
mvn flyway:migrate
```
3.Inicie a aplicação:
```bash
mvn spring-boot:run
```
4. Acesse a documentação Swagger em:
```bash
http://localhost:8080/swagger-ui.html
```
   
📌 Endpoints Principais
- POST /api/auth/login - Autenticação de usuário
- GET /api/entidades - Lista todas as entidades
- POST /api/entidades - Cria nova entidade
- GET /api/entidades/{id} - Busca entidade por ID

📝 Observações
Uso de DTOs para transferência de dados

Mapeamento objeto-relacional com JPA/Hibernate

Validação de entrada com Bean Validation

Gerenciamento de transações com @Transactional

