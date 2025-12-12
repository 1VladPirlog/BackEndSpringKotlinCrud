
# Kotlin Spring Boot Backend Demo

A simple backend service built with **Kotlin**, **Spring Boot**, **Gradle**, and **H2/PostgreSQL**.  
This project was created as a demonstration of backend development fundamentals, including:

- REST API design
- CRUD operations
- Service-layer architecture
- JPA/Hibernate persistence
- Environment setup with Docker (optional)
- Clean code structure suitable for production services

---

## 🚀 Technologies Used

- **Kotlin**
- **Spring Boot** (Web, Data JPA)
- **Gradle Kotlin DSL**
- **H2 Database** (in-memory for development)
- **PostgreSQL** (via Docker, optional)
- **Docker & Docker Compose** (optional)
- **Spring MVC** (controllers)
- **Spring Data JPA** (repositories)

---

## 🔥 Features

### ✔ CRUD API for Items
| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | `/api/items` | Get all items |
| GET | `/api/items/{id}` | Get one item |
| POST | `/api/items` | Create an item |
| PUT | `/api/items/{id}` | Update an item |
| DELETE | `/api/items/{id}` | Delete an item |

---


## ▶️ Running the Project (Local)

This application can be run in three different ways, depending on your needs:

Local run with an in-memory database (H2)

Local run with PostgreSQL (Docker)

Fully containerized (Docker)

## 🟢 Option 1: Local Run (H2 – Default)

This is the simplest way to start the application.

Prerequisites

JDK 21+

Gradle Wrapper (included in the project)

Start the application

  ./gradlew bootRun

Application URL

  http://localhost:8080

Health check endpoint

  http://localhost:8080/hello

## 🗄 In-Memory Database (H2)

By default, the application uses an H2 in-memory database for easy local development.

H2 Web Console

  http://localhost:8080/h2-console

Connection details

  JDBC URL: jdbc:h2:mem:testdb
  Username: sa
  Password: (empty)

