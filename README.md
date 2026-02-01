# 🚀 Ecommerce API - Spring Boot & Docker

API RESTful para gerenciamento de catálogo de produtos, focada em arquitetura escalável e infraestrutura moderna.

## 🛠 Tecnologias
- Java 17 / Spring Boot 3
- PostgreSQL (Banco de dados)
- Docker & Docker Compose (Containerização)
- Swagger (Documentação)

---

## 🏗 Arquitetura
O projeto utiliza **Arquitetura em Camadas**:
- **Controller**: Endpoints e comunicação JSON.
- **Service**: Lógica de negócio e validações.
- **Repository**: Comunicação com o banco (JPA).
- **Entity**: Modelagem das tabelas.

---

## 📖 Documentação (Swagger)
Com a aplicação rodando, acesse a interface visual para testar os endpoints:
http://localhost:8080/swagger-ui/index.html

---

## 🚀 Como Executar o Projeto
Requisitos: Docker instalado (Ubuntu).

1. Build do projeto:
```bash
   ./mvnw clean package -DskipTests
```
2. Subir containers:
```bash
   docker-compose up --build
```

---

## 📡 Endpoints Principais
- GET /api/produtos (Listar tudo)
- POST /api/produtos (Cadastrar novo)
- PUT /api/produtos/{id} (Atualizar dados)
- DELETE /api/produtos/{id} (Remover produto)

---
