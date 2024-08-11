# Estimated Consumption Application - Backend

![Animasyonlu GIF](/images/Estimate.gif)

This is the backend part of the Estimated Consumption Application. It is built with Java using Spring Boot, Lombok, and PostgreSQL as the database. The project is containerized using Docker, making it easier to deploy and run.

## Prerequisites

Before setting up the project, ensure you have the following installed on your machine:

* **Java Development Kit (JDK) 21 or higher**
* **Maven** - To build and manage the project dependencies.
* **Docker** - To run the application in a containerized environment.
* **PostgreSQL** - As the relational database.

## Getting Started

### Step 1: Clone the Repository

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yasinakgulbp/consumption.git

2. **Navigate to the project directory:**

    ```bash
    cd consumption


# DOCKER

___
### Docker use some pratics code


### Postgresql image download and manage to password,username


```bash
docker run --name postgres -e POSTGRES_PASSWORD=root -e POSTGRES_USER=root -d -p 5432:5432  postgres
```
## Configure Database Credentials

Update `src/main/resources/application.properties` with the following content:

```properties
spring.application.name=consumption
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=org.postgresql.Driver
```

# Hibernate JPA properties
```properties
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```

# Access the Application
   The application runs on http://localhost:5432
# The application has 2 apis
```bash
GET /api/cities
POST /api/consumption
```
