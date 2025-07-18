# 📦 API REST - Cadastro de Pessoas com Consulta de Endereço por CEP

Este projeto foi desenvolvido como parte do desafio **"Design Patterns com Java"** da plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**, no programa **TONNIE - Java and AI in Europe**.  
O objetivo é aplicar **padrões de projeto (Design Patterns)** com **Java e Spring Boot** em uma solução prática e funcional.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- OpenFeign
- Banco de Dados H2 (em memória)
- Lombok
- Bean Validation (Jakarta)
- Maven

---

## 💡 Objetivo do Projeto

Criar uma **API RESTful** capaz de cadastrar pessoas e, ao informar o **CEP**, preencher automaticamente o endereço completo utilizando a **API pública do ViaCEP**.

A arquitetura do sistema foi cuidadosamente planejada para demonstrar o uso de **padrões de projeto clássicos do Java**, de forma clara e didática.

---

## 📐 Padrões de Projeto Aplicados

| Padrão              | Onde foi aplicado                                                                 |
|---------------------|-----------------------------------------------------------------------------------|
| **Strategy**        | Interface `EnderecoService` com múltiplas implementações (ViaCep e Mock)         |
| **Facade**          | `PessoaController` atua como fachada para orquestrar chamadas de serviço         |
| **Repository**      | Utilização do Spring Data JPA (`PessoaRepository`) para acesso aos dados         |
| **DTO (Data Transfer Object)** | Separação clara entre modelos de domínio e dados trafegados na API          |

---

## 🧱 Estrutura da Solução

```
src/
├── controller/              # REST Controllers (Facade)
├── dto/                    # Data Transfer Objects
├── model/                  # Entidades JPA
├── repository/             # Repositórios (Spring Data JPA)
├── service/                # Serviços de negócio
│   ├── strategy/           # Implementações do padrão Strategy
├── client/                 # Feign Client para ViaCEP
└── resources/
└── application.properties  # Configurações da aplicação
```

---

## 📲 Endpoints da API

### ✅ `POST /pessoas`

Cadastra uma nova pessoa consultando o endereço via CEP.

**Request Body:**

```json
{
  "nome": "Maria Oliveira",
  "cep": "01001000"
}
```

**Response:**

```json
{
  "id": 1,
  "nome": "Maria Oliveira",
  "logradouro": "Praça da Sé",
  "bairro": "Sé",
  "cidade": "São Paulo",
  "estado": "SP"
}
```

---

### ✅ `GET /pessoas`

Lista todas as pessoas cadastradas.

---

## 🔌 Integração com o ViaCEP

Utilizamos o [ViaCEP](https://viacep.com.br/) como serviço externo para consulta de endereço, implementado com **OpenFeign**, seguindo boas práticas de integração HTTP.

---

## 💻 Acesso ao banco H2 (console)

- URL: [http://localhost:9090/h2-console](http://localhost:9090/h2-console)
- JDBC URL: `jdbc:h2:mem:db`
- Username: `sa`
- Password: *(em branco)*

---

## ▶️ Como executar o projeto localmente

### ✅ Pré-requisitos

- Java 17+ instalado
- Maven instalado (ou usar o wrapper `./mvnw`)
- IDE como IntelliJ ou VSCode (opcional)
- Conexão com a internet (para acessar o ViaCEP)

### ✅ Passos para rodar o projeto

```bash
# 1. Clone o repositório
git clone https://github.com/PatrickyLucas/desafio-busca-endereco-dio.git
cd seu-repositorio

# 2. Execute o projeto com Maven
./mvnw spring-boot:run
```

> Ou simplesmente rode a classe `EnderecopessoasApplication.java` pela sua IDE favorita.

### 🔍 Teste os endpoints

Você pode usar o [Postman](https://www.postman.com/) ou `curl`:

#### Criar nova pessoa (POST)

```bash
curl -X POST http://localhost:9090/pessoas \
-H "Content-Type: application/json" \
-d '{"nome": "João Silva", "cep": "01001000"}'
```

#### Listar todas as pessoas (GET)

```bash
curl http://localhost:9090/pessoas
```

### 🧪 Acessar o console H2

- URL: [http://localhost:9090/h2-console](http://localhost:9090/h2-console)
- JDBC URL: `jdbc:h2:mem:db`
- Usuário: `sa`
- Senha: *(em branco)*

---

## ✍️ Autor

**Desenvolvido por:** Patricky Lucas  
**Desafio:** [DIO - TONNIE - Java and AI in Europe](https://www.dio.me/)  
**LinkedIn:** [https://www.linkedin.com/in/patrickylucas/](https://www.linkedin.com/in/patrickylucas/)

---

## 📄 Licença

Este projeto é de livre uso para fins educacionais.

----------------------------------------------------------------------------------------

<p align="center"><em>Dúvidas ou sugestões? Abra uma issue ou entre em contato!</em></p>
<p align="center"><em>Contribuições são bem-vindas!</em></p>
