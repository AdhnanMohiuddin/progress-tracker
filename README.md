# Progress Tracker – Spring Boot Application

A productivity-focused Spring Boot web application designed to help users track progress and improve efficiency using a clean, layered architecture.

---

## 🚀 Tech Stack
- Java 24
- Spring Boot 3.5.5
- Spring Data JPA
- Spring Web
- Thymeleaf
- MySQL
- Maven
- Lombok

---

## ✨ Features
- MVC-based Spring Boot architecture
- CRUD operations using Spring Data JPA
- RESTful endpoints
- Server-side rendering with Thymeleaf
- MySQL database integration
- Clean layered architecture (Controller, Service, Repository)

---

## 📁 Project Structure

```text
src/main/java/com/app
├── controller      # REST & MVC controllers
├── service         # Business logic layer
├── repository      # Data access layer
├── model           # Domain models / entities
└── ProgressTrackerApplication.java  # Spring Boot entry point
```

## ⚙️ Prerequisites
- Java 24+
- Maven
- MySQL
- IDE (IntelliJ IDEA or Eclipse recommended)

---

## ▶️ How to Run

1. **Clone the repository**

   ``` bash
   git clone https://github.com/your-username/progress-tracker.git
   cd progress-tracker ```
   
2. **Configure MySQL**
```
Update src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/progress_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
3. **Run the application**
```
mvn spring-boot:run

```
4. **Open your browser**
```
http://localhost:8080
```

##License

- This project is licensed under the MIT License.
