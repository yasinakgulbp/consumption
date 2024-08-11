# Estimated Consumption Application - Backend

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


html
docker run --name postgres -e POSTGRES_PASSWORD=root -e POSTGRES_USER=root -d -p 5432:5432  postgres


### Mysql image download and manage to password,username


html
docker run --name mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_PASSWORD=root -e MYSQL_DATABASE=mysqldatabase -d -p 3306:3306 mysql


Bu komut, MySQL veritabanını kullanarak bir Docker konteyneri oluşturur. İşte komutun parçalarının açıklamaları:

- name mysql: Konteynere verilecek isim.
- MYSQL_ROOT_PASSWORD=root: MySQL kök kullanıcısının parolası.
- MYSQL_USER=root: Oluşturulacak kullanıcının adı.
- MYSQL_PASSWORD=root: Oluşturulacak kullanıcının parolası.
- MYSQL_DATABASE=mysqldatabase: Oluşturulacak veritabanının adı.
- d: Konteynerin arka planda çalıştırılmasını sağlar.
- p 3306:3306: Konteynerin 3306 portunu yerel makinenin 3306 portuna yönlendirir. Bu, MySQL sunucusuna yerel makineden erişebilmenizi sağlar.
- mysql: Kullanılacak Docker görüntüsü.

