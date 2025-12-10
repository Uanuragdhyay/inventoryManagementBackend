# Inventory Management Backend (Spring Boot)

> A clean, modular, and beginner-friendly **Spring Boot REST API** for handling product inventory.

## About

This repository contains a **Java Spring Boot backend application** designed for managing product inventory data.  
It provides RESTful APIs for creating, updating, retrieving, and deleting products.  
The project follows a clean, modular structure with:

- **Controller layer** — Handles incoming REST API requests  
- **Service layer** — Business logic  
- **Repository layer** — Database operations via Spring Data JPA  
- **Model layer** — Entity structure  

## Features

- Add, update, delete & fetch products  
- Layered architecture (Controller → Service → Repository)  
- Built with Spring Boot  
- Supports H2 (default) and MySQL  
- Fast backend using embedded Tomcat  
- Ready for unit testing  
- Clean & readable codebase  

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming language |
| Spring Boot | Backend framework |
| Spring Data JPA | ORM for DB operations |
| H2 / MySQL | Database |
| JUnit | Testing framework |
| Maven | Build tool |

## Project Structure

```
src/
 └── main/
     ├── java/com/example/inventory_management/
     │   ├── controller/
     │   │    └── ProductController.java
     │   ├── model/
     │   │    └── Product.java
     │   ├── repository/
     │   │    └── ProductRepository.java
     │   ├── service/
     │   │    └── ProductService.java
     │   └── InventoryManagementApplication.java
     │
     └── resources/
         ├── application.properties
         └── data.sql (optional)
```

## API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | /products | Fetch all products |
| GET | /products/{id} | Fetch product by ID |
| POST | /products | Create a new product |
| PUT | /products/{id} | Update an existing product |
| DELETE | /products/{id} | Delete a product |

## Getting Started

### 1. Clone the repository
```
git clone https://github.com/<your-username>/inventoryManagementBackend.git
cd inventoryManagementBackend
```

### 2. Run the application
```
mvn spring-boot:run
```

### 3. Access the API
```
http://localhost:8080/products
```

## Database Configuration

### H2 Default DB
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

### MySQL Configuration
```
spring.datasource.url=jdbc:mysql://localhost:3306/inventorydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

## Sample JSON
```
{
  "name": "Laptop",
  "quantity": 10,
  "price": 55000
}
```

## Author

**Anurag Upadhyay**  

## **💌 Contact & Support**
📧 Email: [uanurag@gmail.com](mailto:uanurag@gmail.com)  
📌 GitHub: [GitHub Profile](https://github.com/Uanuragdhyay)
