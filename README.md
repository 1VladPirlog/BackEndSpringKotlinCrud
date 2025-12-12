
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

## 📁 Project Structure

src/
└── main/

├── kotlin/com/vlad/backenddemo

│ ├── BackendDemoApplication.kt

│ ├── Item.kt

│ ├── ItemRepository.kt

│ ├── ItemService.kt

│ └── ItemController.kt

└── resources/

├── application.properties

└── data.sql (optional seed data)

**Architecture Pattern:** Controller → Service → Repository → Database

This separation shows clean layering and is commonly used in real production applications.

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

## 🧪 Example JSON

### Create (POST `/api/items`)
```json
{
  "name": "Laptop",
  "price": 4999.99
}

Update (PUT /api/items/1)
{
  "name": "Gaming Laptop",
  "price": 5999.99
}

▶️ Running the Project (Local)

Make sure you have:

JDK 21+

Gradle wrapper (already included)

Docker (optional)

Run:

./gradlew bootRun


The application starts on:

http://localhost:8080


Test the health endpoint:

http://localhost:8080/hello

🗄 In-Memory Database (H2)

This project uses H2 by default for easy setup.

H2 Console (GUI):

http://localhost:8080/h2-console


JDBC URL (auto-configured):

jdbc:h2:mem:testdb

🐳 Running with PostgreSQL (Docker)

If using Docker, first create a docker-compose.yml:

version: '3.8'
services:
  db:
    image: postgres:15
    environment:
      POSTGRES_USER: user
      POSTGRES_PASSWORD: pass
      POSTGRES_DB: items
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data

volumes:
  postgres_data:


Start Postgres:

docker-compose up -d


Then update application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/items
spring.datasource.username=user
spring.datasource.password=pass
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

📦 Dockerizing the App

Add a Dockerfile such as:

FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]


Build the jar:

./gradlew build


Build image:

docker build -t backend-demo .


Run container:

docker run -p 8080:8080 backend-demo

