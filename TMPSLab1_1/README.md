# Creational Design Patterns Laboratory Work (#1)

## Introduction
This laboratory work focuses on understanding and implementing creational design patterns in 
an object-oriented programming context using Java. Creational design patterns provide solutions 
for object creation, aiming to create objects in a manner suitable for various scenarios while 
managing complexity.

## Objectives
1. Study and understand the concepts of creational design patterns.
2. Select a domain area and define its main classes/models/entities.
3. Implement at least three creational design patterns for object instantiation in a sample project.

## Domain Area
The chosen domain for this project is **Bookstore Management**, which involves managing books, 
authors, and orders within a bookstore.

## Main Classes
The following models were defined in the project:

- **Book**: Represents a book with attributes such as title, author, and genre.
- **Order**: Represents a customer's order containing a list of books and customer information.

## Creational Design Patterns Implemented

### 1. Singleton Pattern
The `ConfigManager` class implements the Singleton pattern to provide a single global instance 
for configuration management throughout the application.

### 2. Factory Method Pattern
The `BookFactory` and its subclasses implement the Factory Method pattern, allowing for the creation 
of different types of books (e.g., Fiction, Non-Fiction).

### 3. Builder Pattern
The `Order` class utilizes the Builder pattern to create complex order objects, allowing for a flexible 
and readable construction process.

## Conclusion
This laboratory work provided hands-on experience in implementing creational design patterns in Java. 
By working on the Bookstore Management domain, we successfully integrated the Singleton, Factory Method, 
and Builder patterns, demonstrating their utility in managing object creation and enhancing code 
maintainability. These patterns not only help in organizing code better but also address common design 
challenges faced in software development.