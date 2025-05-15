# 📅 Projeto Agenda API

API REST para gerenciamento de uma agenda de compromissos, desenvolvida com **Spring Boot**, **PostgreSQL**, **Docker**, documentação com **Swagger**, e arquitetura baseada em camadas.

---

## 🚀 Tecnologias Utilizadas

- ✅ Java 17+
- ✅ Spring Boot
  - Spring Web
  - Spring Data JPA
- ✅ PostgreSQL
- ✅ Swagger (Springdoc OpenAPI)
- ✅ Docker & Docker Compose

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    ├── java/
    │   └── com.exemplo.agendaapi/
    │       ├── configurations/   # Configurações (Swagger, Beans, etc)
    │       ├── entities/         # Entidades JPA
    │       ├── repositories/     # Interfaces de repositórios (JPA)
    │       ├── services/         # Regras de negócio
    │       └── controllers/      # REST Controllers
    └── resources/
        └── application.properties
```

---

## ⚙️ Como Rodar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/agenda-api.git
cd agenda-api
```

### 2. Suba o banco de dados com Docker

Execute o comando:

```bash
docker-compose up -d
```

Isso iniciará um container PostgreSQL na porta `5433`.

---

### 3. Configure o `application.properties`

```properties
spring.application.name=projetoAgendaApi
server.port=8081

spring.datasource.url=jdbc:postgresql://localhost:5433/agendaapi_db
spring.datasource.username=agenda_user
spring.datasource.password=agenda_pass
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

---

### 4. Execute a aplicação

Via terminal:

```bash
./mvnw spring-boot:run
```

Ou rode a classe `main` pela sua IDE (IntelliJ, Eclipse, VS Code...).

---

## 📖 Acessando o Swagger

Após iniciar a aplicação, acesse a documentação interativa em:

```
http://localhost:8081/swagger-ui.html
```

ou

```
http://localhost:8081/swagger-ui/index.html
```

---

## 🗄️ Banco de Dados

- **Banco:** `agendaapi_db`
- **Usuário:** `agenda_user`
- **Senha:** `agenda_pass`
- **Porta:** `5433`

---

## 👨‍💻 Autor

Desenvolvido por **Robert Porteles**

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais informações.
