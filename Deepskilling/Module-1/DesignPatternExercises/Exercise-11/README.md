# Exercise 11: Implementing Dependency Injection

## Overview

Dependency Injection (DI) is a design pattern that provides the required dependencies to a class instead of allowing the class to create them itself. This reduces coupling between classes and improves flexibility, maintainability, and testability. In this project, a CustomerService class depends on a CustomerRepository, and the dependency is provided through constructor injection.

---

# 1. Create a New Java Project

Create a Java project named:

**DependencyInjectionExample**

The project contains the following classes:

- CustomerRepository.java
- CustomerRepositoryImpl.java
- CustomerService.java
- Main.java

---

# 2. Define Repository Interface

An interface named **CustomerRepository** is created with the following method:

- `findCustomerById(int id)`

This interface defines the contract for retrieving customer information.

---

# 3. Implement Concrete Repository

The **CustomerRepositoryImpl** class implements the CustomerRepository interface.

Responsibilities:

- Stores or retrieves customer information.
- Implements the `findCustomerById()` method.
- Returns the customer name based on the given customer ID.

---

# 4. Define Service Class

The **CustomerService** class depends on the CustomerRepository interface.

Responsibilities:

- Receives the repository object.
- Calls repository methods to retrieve customer details.
- Does not directly create the repository object.

---

# 5. Implement Dependency Injection

Constructor Injection is used to inject the dependency.

The CustomerRepository object is passed to the CustomerService constructor. This makes the service class independent of the implementation and allows different repository implementations to be used without modifying the service class.

---

# 6. Test the Dependency Injection Implementation

The **Main** class:

- Creates an object of CustomerRepositoryImpl.
- Injects it into CustomerService using the constructor.
- Calls the service method to retrieve customer details.

This demonstrates successful dependency injection.

---

# Advantages of Dependency Injection

- Reduces coupling between classes.
- Improves code reusability.
- Makes unit testing easier.
- Supports flexible and maintainable code.
- Allows easy replacement of implementations.

---

# Applications of Dependency Injection

- Spring Framework
- Enterprise Applications
- Web Applications
- REST APIs
- Microservices

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Dependency Injection (Constructor Injection)

---

# Conclusion

This project demonstrates Dependency Injection using constructor injection. The CustomerService class receives its dependency from outside instead of creating it internally, resulting in a loosely coupled, flexible, and maintainable application.