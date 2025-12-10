🎉 Inventory Management Backend
⚡ A Simple & Clean Spring Boot REST API for Managing Products

Welcome to the Inventory Management Backend — a lightweight yet powerful REST API built using Spring Boot, perfect for learning backend development or showcasing clean project structure in your portfolio.

🌈 Tech Stack
Technology	Description
☕ Java	Main programming language
🌱 Spring Boot	Backend framework
🗄️ Spring Data JPA	ORM layer
🛢️ H2 / MySQL	Database (depending on your configuration)
🧪 JUnit	Testing framework
📁 Project Structure (Easy & Understandable)
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


Each layer has a clear responsibility:

Controller → Handles API requests

Service → Business logic

Repository → Database operations

Model → Entity class

🚀 Features

✨ Add, update, delete & fetch products
📦 Store product details (name, quantity, price)
🔍 Search product by ID
💡 Layered architecture (Controller → Service → Repository)
⚡ Powered by Spring Boot’s fast embedded Tomcat server
🧪 Ready for unit testing

🔥 REST API Endpoints
📦 Product Management
Method	Endpoint	Description
GET	/products	Fetch all products
GET	/products/{id}	Fetch product by ID
POST	/products	Add a new product
PUT	/products/{id}	Update existing product
DELETE	/products/{id}	Delete product
🧠 Backend Flow (Simple Diagram)
Client → Controller → Service → Repository → Database


This ensures modular, testable, and scalable code.

⚙️ How to Run the Project
🔧 Step 1: Clone the repo
git clone https://github.com/<your-username>/inventoryManagementBackend.git
cd inventoryManagementBackend

📦 Step 2: Build & Run
mvn spring-boot:run


Or open the project in your IDE and run:

InventoryManagementApplication.java

🌐 Step 3: Access the API

Open Postman or browser:

http://localhost:8080/products


🎉 You're live!

🛢️ Database Setup
Default: H2 In-Memory DB

Inside application.properties:

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true


H2 Console available at:

http://localhost:8080/h2-console

OR Use MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/inventorydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

📝 Example Product JSON
{
  "name": "Laptop",
  "quantity": 10,
  "price": 55000
}

⭐ This Project Is Demonstrates:

Realistic Spring Boot project structure

Uses MVC + Service + Repository (industry standard)

Perfect demonstration of API building

Shows hands-on experience with backend development

Clean, modular, and scalable architecture

🙌 Author

👤 Anurag Upadhyay
🔗 GitHub: https://github.com/Uanuragdhyay
