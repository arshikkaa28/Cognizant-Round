# Inventory Management System

## Overview
The Inventory Management System is a Java-based application developed to manage products in a warehouse. It demonstrates the use of Data Structures and Algorithms (DSA) to efficiently store, retrieve, update, and delete inventory records. The project uses a HashMap to organize product information based on unique product IDs, ensuring fast and efficient operations.

---

## Problem Statement
In a warehouse, maintaining a large inventory requires efficient storage and retrieval of product information. As the number of products increases, searching and managing records manually or with inefficient data structures becomes time-consuming. This project provides a simple inventory management solution that allows users to add, update, delete, and display product details efficiently.

---

## Importance of Data Structures and Algorithms
Data Structures and Algorithms play a vital role in inventory management because they improve the efficiency of data storage and retrieval. They help in reducing search time, organizing data effectively, and improving the overall performance of the system. Choosing the appropriate data structure ensures that operations such as insertion, deletion, and updating remain fast even when the inventory contains a large number of products.

---

## Data Structure Used
This project uses **HashMap<Integer, Product>** from the Java Collections Framework.

### Why HashMap?
- Stores products using a unique Product ID as the key.
- Provides fast access to product information.
- Allows efficient insertion, updating, and deletion of records.
- Suitable for applications where quick lookup is required.

### Other Suitable Data Structures
- **ArrayList:** Easy to use but searching and updating require linear time.
- **LinkedList:** Efficient for insertions and deletions but slower searching.
- **TreeMap:** Maintains products in sorted order but has higher operation cost than HashMap.

Among these, **HashMap** is the most appropriate choice because Product IDs are unique and frequently used for searching.

---

## Project Setup
The project consists of two Java classes:

- **Product.java** – Represents a product with attributes such as Product ID, Product Name, Quantity, and Price.
- **InventoryManagement.java** – Implements inventory operations using a HashMap.

---

## Features
- Add a new product
- Update existing product details
- Delete a product from inventory
- Display all available products
- Store product information efficiently using HashMap

---

## Product Attributes
Each product contains the following information:
- Product ID
- Product Name
- Quantity
- Price

---

## Time Complexity Analysis

| Operation | Time Complexity |
|-----------|-----------------|
| Add Product | O(1) (Average) |
| Update Product | O(1) (Average) |
| Delete Product | O(1) (Average) |
| Search Product | O(1) (Average) |
| Display All Products | O(n) |

> **Note:** In rare cases involving many hash collisions, HashMap operations may take O(n) time.

---

## Optimization
The performance of the inventory system can be optimized by:
- Using **HashMap** for direct access to products through Product ID.
- Using unique Product IDs to avoid duplicate records.
- Selecting an appropriate initial capacity for the HashMap when handling very large inventories.
- Reducing unnecessary searches by accessing products directly using their keys.

---

## Technologies Used
- Java
- Java Collections Framework (HashMap)
- Data Structures and Algorithms (DSA)

---

## Conclusion
This project demonstrates how Data Structures and Algorithms can be applied to solve real-world inventory management problems. By using a HashMap, the system performs add, update, delete, and search operations efficiently, making it suitable for managing large inventories with improved performance and reduced processing time.