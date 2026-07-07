# Exercise 7: Implementing the Observer Pattern

## Overview

The Observer Pattern is a Behavioral Design Pattern that defines a one-to-many relationship between objects. When the state of one object (Subject) changes, all its dependent objects (Observers) are automatically notified and updated. In this project, the Observer Pattern is used to notify multiple applications whenever the stock price changes.

---

# 1. Create a New Java Project

Create a Java project named:

**ObserverPatternExample**

The project contains the following classes:

- Stock.java
- Observer.java
- StockMarket.java
- MobileApp.java
- WebApp.java
- ObserverTest.java

---

# 2. Define Subject Interface

An interface named **Stock** is created with the following methods:

- `registerObserver()`
- `removeObserver()`
- `notifyObservers()`

These methods allow observers to register, deregister, and receive notifications.

---

# 3. Implement Concrete Subject

The **StockMarket** class implements the Stock interface.

Responsibilities:

- Maintains a list of registered observers.
- Stores the current stock name and price.
- Notifies all observers whenever the stock price changes.

---

# 4. Define Observer Interface

An interface named **Observer** is created with the method:

- `update(String stockName, double price)`

Every observer must implement this method to receive stock updates.

---

# 5. Implement Concrete Observers

Two observer classes are implemented:

- **MobileApp**
- **WebApp**

Both classes implement the Observer interface and display the updated stock information whenever they receive a notification.

---

# 6. Test the Observer Implementation

The **ObserverTest** class:

- Creates a StockMarket object.
- Registers MobileApp and WebApp as observers.
- Updates stock prices.
- Demonstrates that all registered observers receive notifications automatically.

---

# Advantages of Observer Pattern

- Supports one-to-many communication.
- Promotes loose coupling between Subject and Observers.
- Easy to add or remove observers.
- Improves maintainability and scalability.
- Automatic notification when data changes.

---

# Applications of Observer Pattern

- Stock Market Applications
- Notification Systems
- Weather Monitoring Systems
- Chat Applications
- Event Management Systems
- News Subscription Services

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Observer Design Pattern

---

# Conclusion

This project demonstrates the implementation of the Observer Design Pattern using a stock market monitoring application. The StockMarket class acts as the Subject, while MobileApp and WebApp act as Observers. Whenever the stock price changes, all registered observers are automatically notified, ensuring that every client receives the latest information.