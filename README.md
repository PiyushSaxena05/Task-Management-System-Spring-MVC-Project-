Task Management System (Spring MVC Project)
This is a Task Management System built using Spring MVC, Spring Data JPA, Lombok, and Spring Boot DevTools. The application allows users to create, read, update, and delete (CRUD) tasks while maintaining a clean and scalable backend architecture.

The project demonstrates best practices such as using DTOs (Data Transfer Objects) to separate the database layer (entities) from the API layer, ensuring maintainability and security.

Features

Add Tasks: Create new tasks with Task ID, Name, Target, and Completed Count.

Update Tasks: Modify existing tasks easily.

Delete Tasks: Remove tasks by their ID.

View Tasks: Fetch all tasks or a specific task by ID.

DTO Layer: Exposes only necessary data to APIs, preventing direct exposure of entity objects.

Spring Data JPA: Simplifies database operations.

Lombok: Reduces boilerplate code like getters, setters, and constructors.

DevTools: Enables hot reloading for rapid development.

Technology Stack

Java

Spring MVC & Spring Boot

Spring Data JPA

MySQL (or any relational database)

Lombok

Postman (for API testing)

Maven

Spring Boot DevTools

How to Run

Clone the repository:

git clone https://github.com/PiyushSaxena05/Task-Management-System-Spring-MVC-Project-.git


Import the project into your IDE (Eclipse / IntelliJ / VS Code).

Configure application.properties for your database connection.

Run the application as a Spring Boot app.

Test the APIs using Postman.

Folder Structure

model: Entity classes representing database tables.

dto: Data Transfer Objects to expose only necessary data.

repository: Spring Data JPA repositories for database access.

service: Business logic implementation.

controller: REST API endpoints.

Why This Project?

This mini project is ideal for:

Learning Spring MVC and Spring Data JPA.

Understanding DTOs and separation between entity and API layers.

Practicing CRUD operations with REST APIs.

Building a portfolio-ready Java backend project.

GitHub Repository: https://github.com/PiyushSaxena05/Task-Management-System-Spring-MVC-Project-.git
