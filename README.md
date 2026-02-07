# A Demo to create a Simple Spring Boot REST Application

Book Inventory API
- This is a simple Book Inventory Service built with Spring Boot. It acts as a digital catalog that allows users to look up specific book information (Title and Author) using a unique Book ID.

## Table of contents
* [Key Features](#Key-Features)
* [How to Use](#How-to-Use)
* [Technology Stack](#Technology-Stack)

### Key Features
* Search by ID: Instantly retrieve book details via a dedicated web link.
* Response: A book information in JSON format.
* Error Handling: Provides clear messages if a book cannot be found.

## How to Use
1. Start the App: Run the application in your Java environment (e.g., IntelliJ).
2. Open Postman: Create a new GET request.
3. Enter URL: http://localhost:8080/books/{id} (replace {id} with a real number, like 1).
4. View Results: The system will display the book's ID, Title, and Author.

## Technology Stack
* Java 17
* Spring Boot 3
* H2 Database
* Maven
* JUnit 5
* Mockito
* Lombok