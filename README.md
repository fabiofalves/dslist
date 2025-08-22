# 🎮 API REST - Catálogo de Jogos  

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen?style=for-the-badge&logo=springboot)  
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)  
![Docker](https://img.shields.io/badge/Docker-Local-blue?style=for-the-badge&logo=docker)  
![H2](https://img.shields.io/badge/Database-H2-lightgrey?style=for-the-badge&logo=h2)  
![Postman](https://img.shields.io/badge/Postman-Testing-orange?style=for-the-badge&logo=postman)  
![Lombok](https://img.shields.io/badge/Lombok-Boilerplate-lightblue?style=for-the-badge)  

---

Este projeto é uma **API REST** desenvolvida em **Java com Spring Boot**, que retorna uma lista de jogos com informações detalhadas e permite consultas por ID e listas categorizadas.  

A aplicação foi criada durante o **Intensivão Java e Spring**, ministrado pelo professor **Nélio Alves** da **DevSuperior**.  

---

## 📐 Arquitetura do Projeto  

O sistema segue a **arquitetura em camadas**, garantindo organização, manutenção e boas práticas:

- **Entities** → Modelagem das entidades de domínio  
- **Repositories** → Acesso e persistência dos dados  
- **Services** → Regras de negócio e lógica da aplicação  
- **Controllers** → Exposição dos endpoints REST  

---

## 🔄 Fluxo de uma Requisição  

1. O **cliente** faz a chamada para um endpoint REST.  
2. O **Controller** recebe a requisição.  
3. O **Service** processa a lógica de negócio.  
4. O **Repository** acessa os dados no banco.  
5. A resposta é transformada em **DTO** e devolvida ao cliente em **JSON**.  

---

## 📌 Funcionalidades  

- 🔍 Buscar jogo por **ID**  
- 📜 Listar todos os jogos disponíveis  
- 🗂️ Consultar **listas categorizadas** de jogos em `/lists`  
- Alterar a posição de um jogo em uma lista, permitindo reordenar os itens

---

## 🚀 Tecnologias utilizadas  

- **Java 21**  
- **Spring Boot**  
- **Banco H2** (para testes)  
- **Maven**  
- **Postman** (para testes de API)  
- **Docker Compose** (ambiente local e homologação)  
- **Lombok** (eliminação de código boilerplate)  

---

## 📌 Endpoints principais  

| Método | Endpoint              | Descrição                           |
|--------|-----------------------|-------------------------------------|
| GET    | `/games`              | Lista todos os jogos                |
| GET    | `/games/{id}`         | Retorna os detalhes de um jogo por ID |
| GET    | `/lists`              | Retorna todas as listas de jogos    |
| GET    | `/lists/{id}/games`   | Lista jogos de uma categoria específica |
| POST   | `/lists/{listId}/replacement`   | Altera a posição de um jogo dentro da lista |

---

## 🛠️ Como executar o projeto  

### Pré-requisitos  
- [Java 21](https://adoptium.net/)  
- [Maven](https://maven.apache.org/)  
- [Docker](https://www.docker.com/)  

### Passos para rodar localmente  

```bash
# Clonar o repositório
git clone https://github.com/fabiofalves/dslist.git

# Entrar na pasta do projeto
cd nome-do-repo

# Construir o projeto
mvn clean install

# Subir com Docker Compose
docker compose up

# A aplicação estará disponível em:
http://localhost:8080
```

---

## 📷 Exemplo de resposta  

### Requisição:  
`GET http://localhost:8080/games/1`  

### Resposta:  
```json
{
  "id": 1,
  "title": "Mass Effect Trilogy",
  "year": 2012,
  "genre": "Role-playing (RPG), Shooter",
  "platforms": "XBox, Playstation, PC",
  "score": 4.8,
  "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
  "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
  "longDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa."
}
```

---

## 📖 Aprendizados  

Durante este projeto, pude aprender e praticar:  

- Criação e consumo de **APIs REST** com Spring Boot  
- **Modelagem de domínio** e boas práticas de arquitetura  
- Uso de **DTOs e projections** para melhorar a performance  
- **Testes em memória** com banco H2  
- **Ambiente local com Docker Compose**  
- **Homologação local** de serviços  
- Redução de código repetitivo com **Lombok**  

---

## 👨‍💻 Autor  

Projeto desenvolvido durante o **Intensivão Java e Spring** com o professor **Nélio Alves** e a equipe da **DevSuperior**.  

📌 **Fabio Figueiredo Alves**  
🔗 [LinkedIn](https://www.linkedin.com/in/fabiofigueiredoalves/)  
