# 📚 LibraryManagement Project

## Student Information

* **Project Name:** LibraryManagement
* **Technology Used:** Java, Maven, Spring Framework, Spring Boot
* **IDE:** IntelliJ IDEA

---

# Project Overview

This project is developed for the **Spring Framework Exercises**. It demonstrates Spring Core, Spring IoC, Dependency Injection, Maven Configuration, and Spring Boot concepts.

---

# Project Structure

```
LibraryManagement
│
├── pom.xml
│
├── src
│   └── main
│       ├── java
│       │   └── com.library
│       │       ├── controller
│       │       │     BookController.java
│       │       │
│       │       ├── entity
│       │       │     Book.java
│       │       │
│       │       ├── repository
│       │       │     BookRepository.java
│       │       │
│       │       ├── service
│       │       │     BookService.java
│       │       │
│       │       └── LibraryManagementApplication.java
│       │
│       └── resources
│           ├── applicationContext.xml
│           └── application.properties
│
└── README.md
```

---

# Exercise Wise Implementation

## ✅ Exercise 1 – Configuring a Basic Spring Application

### Files Used

* pom.xml
* applicationContext.xml
* BookService.java
* BookRepository.java
* LibraryManagementApplication.java

### Description

* Created a Maven project.
* Added Spring Core dependency.
* Configured Spring beans using XML.
* Loaded the Spring Application Context.

---

## ✅ Exercise 2 – Dependency Injection

### Files Used

* applicationContext.xml
* BookService.java
* BookRepository.java

### Description

* Implemented Setter Dependency Injection.
* Injected BookRepository into BookService.

---

## ✅ Exercise 4 – Creating and Configuring a Maven Project

### Files Used

* pom.xml

### Description

* Added Spring Context dependency.
* Added Spring AOP dependency.
* Added Spring WebMVC dependency.
* Configured Maven Compiler Plugin.
* Configured Spring Boot Maven Plugin.

---

## ✅ Exercise 5 – Spring IoC Container

### Files Used

* applicationContext.xml
* BookService.java
* BookRepository.java

### Description

* Configured Spring IoC Container.
* Defined Spring Beans.
* Loaded beans using ApplicationContext.

---

## ✅ Exercise 7 – Constructor and Setter Injection

### Files Used

* applicationContext.xml
* BookService.java

### Description

* Implemented Constructor Injection.
* Implemented Setter Injection.
* Verified dependency injection through Spring configuration.

---

## ✅ Exercise 9 – Spring Boot Application

### Files Used

* application.properties
* Book.java
* BookRepository.java
* BookController.java
* LibraryManagementApplication.java

### Description

* Created Spring Boot Application.
* Configured H2 Database.
* Configured Spring Data JPA.
* Created REST Controller.
* Implemented CRUD operations.

---

# Technologies Used

* Java
* Maven
* Spring Core
* Spring IoC
* Spring Dependency Injection
* Spring AOP
* Spring MVC
* Spring Boot
* Spring Data JPA
* H2 Database

---

# How to Run

1. Open the project in IntelliJ IDEA.
2. Wait for Maven dependencies to download.
3. Run `LibraryManagementApplication.java`.
4. Test the application.

---

# Conclusion

This project successfully demonstrates the implementation of all the required Spring Framework exercises, including Maven configuration, Spring IoC, Dependency Injection, Constructor Injection, Setter Injection, and Spring Boot REST application development.
