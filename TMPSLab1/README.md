# Notification Management System

## Introduction
This project implements a simple notification management system in Java, adhering to several principles 
of object-oriented design known as SOLID principles. The system is designed to handle different 
types of notifications, including email, SMS, and push notifications.

## SOLID Principles Implemented

### 1. Single Responsibility Principle (SRP)
Each class has a single responsibility. For example:
- `EmailNotificationSender` is solely responsible for sending email notifications.
- `SMSNotificationSender` handles SMS notifications.

### 2. Open/Closed Principle (OCP)
The system is designed to allow easy addition of new notification types. For instance, to add a 
new type (e.g., `PushNotificationSender`), we create a new class without modifying existing code.

### 3. Liskov Substitution Principle (LSP)
All subclasses of `NotificationSender` can be used interchangeably in `NotificationService`. This ensures 
the system operates correctly regardless of the specific notification sender implementation.

### 4. Dependency Inversion Principle (DIP)
The `NotificationService` class does not depend directly on the concrete implementations of notification 
senders. Instead, it relies on the `NotificationFactory`, promoting a higher level of abstraction and 
decoupling.

## Conclusion

This project successfully demonstrates the application of key SOLID principles in a real-world scenario. 
By following these principles, the code remains modular, extensible, and maintainable. 
Overall, this exercise illustrates the importance of good design practices in software development.
