# Exercise 6: Implementing the Proxy Pattern

## Overview

The Proxy Pattern is a Structural Design Pattern that provides a placeholder or substitute for another object to control access to it. It is commonly used to implement lazy initialization, caching, access control, and logging. In this project, the Proxy Pattern is used to delay loading an image from a remote server until it is actually needed.

---

# 1. Create a New Java Project

Create a Java project named:

**ProxyPatternExample**

The project contains the following classes:

- Image.java
- RealImage.java
- ProxyImage.java
- ProxyTest.java

---

# 2. Define Subject Interface

An interface named **Image** is created with the following method:

- `display()`

This interface is implemented by both the RealImage and ProxyImage classes.

---

# 3. Implement Real Subject Class

The **RealImage** class implements the Image interface.

Responsibilities:
- Loads the image from a remote server.
- Displays the image after loading.

Since loading an image from a server is expensive, it should happen only when required.

---

# 4. Implement Proxy Class

The **ProxyImage** class also implements the Image interface.

Responsibilities:
- Stores the image file name.
- Holds a reference to the RealImage object.
- Creates the RealImage object only when `display()` is called for the first time (Lazy Initialization).
- Reuses the same RealImage object for future requests (Caching).

This avoids loading the same image multiple times.

---

# 5. Test the Proxy Implementation

The **ProxyTest** class:

- Creates a ProxyImage object.
- Calls the `display()` method twice.
- Demonstrates that the image is loaded from the server only once and displayed from cache afterward.

---

# Advantages of Proxy Pattern

- Supports lazy initialization.
- Reduces unnecessary object creation.
- Improves application performance.
- Saves memory and network resources.
- Adds an extra layer of control before accessing the real object.

---

# Applications of Proxy Pattern

- Image viewers
- Virtual memory management
- Remote object access
- Web caching
- Database connections
- Security and access control

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Proxy Design Pattern

---

# Conclusion

This project demonstrates the implementation of the Proxy Design Pattern using an image viewer application. The ProxyImage class delays the creation of the RealImage object until it is actually needed and reuses the same object for subsequent requests. This approach improves performance by implementing lazy initialization and caching.