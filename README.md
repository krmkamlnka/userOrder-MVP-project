# Simple Microservices Project (MVP)

This project is a basic microservices application built with **Spring Boot**.  
It provides minimal functionality for user registration, login validation, and order management.

## Features

- **User Registration**: Register a new user with a username and password.
- **User Login**: Validate user credentials.
- **Create Order**: Create an order for a registered user.
- **View Orders**: Retrieve all orders by user ID.

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 (in-memory database) or PostgreSQL (optional)
- Maven or Gradle (depending on your project)

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo.git
   cd your-repo
   ```

2. Build the project:

   ```bash
   ./gradlew clean build
   ```

   or if you are using Maven:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   ./gradlew bootRun
   ```

   or:

   ```bash
   java -jar build/libs/your-app-name.jar
   ```

4. Access API endpoints via Postman or browser:

    - Register user: `POST /api/users/register`
    - Login: `POST /api/users/login`
    - Create order: `POST /api/orders`
    - Get orders by user ID: `GET /api/orders/user/{userId}`

## Notes

- By default, the application runs on `http://localhost:8080`.
- Basic request/response formats are JSON.

---

> This project is a starting point and can be expanded to include authentication (JWT), microservices communication (Feign), Dockerization, etc.