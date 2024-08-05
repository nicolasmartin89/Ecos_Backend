# Ecos Backend

## 🌳Introduction
Ecos Backend is a RESTful API built with Spring Boot and Java that serves as the backend for the Ecosistema application. The API handles data processing, business logic, and communication with the database. It is designed to be scalable, secure, and easy to integrate with front-end applications. This project is called Ecosystem and we generated a platform to connect suppliers whose product or service is sustainable with consumers (companies, organizations, users) who seek to change their consumption habits or improve their value chain.

## 🦖 Features
- RESTful API following best practices.
- CRUD operations for managing entities.
- Database integration using JPA/Hibernate.
- Secure authentication and authorization with JWT.
- Exception handling and validation.
- Detailed logging and monitoring.
- Unit and integration testing.

## 🛠️ Prerequisites
Before you can run the project, make sure you have the following installed on your machine:
- **Java 17** or higher
- **Maven 3.6** or higher
- **MySQL** (or any other database you're using)

## ▶️ Getting Started

### Clone the Repository
Start by cloning the repository to your local machine:
  ```bash
  git clone https://github.com/nicolasmartin89/Ecos_Backend.git
cd Ecos_Backend
  ```
### Configure the Database
  ```bash
  # Example for MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/ecos_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
  ```

## 📁 Project Structure
  ```bash
Ecos_Backend/
│
├── .mvn/                             # Maven Wrapper files
├── src/
│   ├── main/
│   │   ├── java/semillero/ecosistema/ 
│   │   │   ├── configuration/        # Configuration classes (e.g., security, CORS)
│   │   │   ├── controllers/          # REST controllers handling HTTP requests
│   │   │   ├── dtos/                 # Data Transfer Objects for transferring data
│   │   │   ├── entities/             # JPA entities mapping database tables
│   │   │   ├── enumerations/         # Enum classes used throughout the application
│   │   │   ├── exceptions/           # Custom exception classes
│   │   │   ├── mappers/              # Mappers for converting between entities and DTOs
│   │   │   ├── repositories/         # JPA repositories for data access
│   │   │   ├── responses/            # Response wrapper classes for API responses
│   │   │   ├── services/             # Business logic services
│   │   │   ├── utils/                # Utility classes and helpers
│   │   │   ├── EcosistemaApplication.java  # Main class to run the Spring Boot application
│   │   │   └── ServletInitializer.java     # Servlet initializer for configuring the application
│   │   └── resources/
│   │       ├── application.properties  # Main configuration file
│   │       └── static/                 # Static resources (if any)
│   └── test/
│       └── java/semillero/ecosistema/  # Unit and integration tests
│
├── .gitignore                         # Specifies which files to ignore in version control
├── README.md                          # Project documentation
├── mvnw                               # Maven Wrapper for Unix-based systems
├── mvnw.cmd                           # Maven Wrapper for Windows
└── pom.xml                            # Maven configuration file

  ```
Explanation of Project Structure

        configuration/: Contains configuration classes for setting up security, CORS, etc.
        controllers/: REST controllers that handle incoming HTTP requests and route them to the appropriate services.
        dtos/: Data Transfer Objects, used to transfer data between the frontend and backend.
        entities/: JPA entities representing the database tables.
        enumerations/: Enum classes that define sets of constants used throughout the application.
        exceptions/: Custom exceptions to handle specific error cases.
        mappers/: Mapper classes that convert entities to DTOs and vice versa.
        repositories/: JPA repositories for performing CRUD operations on the database.
        responses/: Classes used to structure the responses returned by the API.
        services/: Business logic of the application, usually orchestrating calls to repositories and other services.
        utils/: Utility classes and helper functions used throughout the application.

## 📧 Contacts

- [![Email](https://img.shields.io/badge/Email-nicolasmartin89%40gmail.com-gree)](mailto:nicolasmartin89@gmail.com)
- [![GitHub Profile](https://img.shields.io/badge/GitHub-Profile-blue)](https://github.com/nicolasmartin89)
- [![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-lightgrey)](https://www.linkedin.com/in/nicolas-demis-martin)
