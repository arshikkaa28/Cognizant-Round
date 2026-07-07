# Exercise 4: Employee Management System

## Overview
The Employee Management System is a Java-based application that demonstrates the use of arrays for storing and managing employee records. It performs basic operations such as adding, searching, traversing, and deleting employee records. This project helps understand how arrays work and their role in Data Structures and Algorithms (DSA).

---

# 1. Understand Array Representation

## Array Representation in Memory
An array is a linear data structure that stores elements of the same data type in contiguous memory locations. Each element is accessed using an index, allowing direct access to any element in constant time.

### Advantages of Arrays
- Fast access using index (O(1)).
- Easy to traverse using loops.
- Simple to implement.
- Efficient memory usage due to contiguous storage.

---

# 2. Setup

Create a Java project named **Employee Management System**.

Create the following classes:

- `Employee.java`
- `EmployeeManagement.java`

The `Employee` class contains the following attributes:
- Employee ID
- Name
- Position
- Salary

---

# 3. Implementation

The project uses an array to store employee records.

The following operations are implemented:
- Add Employee
- Search Employee
- Traverse Employee Records
- Delete Employee

The employee records are stored in an `Employee[]` array.

---

# 4. Analysis

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Add Employee | O(1) |
| Search Employee | O(n) |
| Traverse Employees | O(n) |
| Delete Employee | O(n) |

### Explanation
- **Add:** Inserts the employee at the next available position, so it takes constant time.
- **Search:** May need to check every employee until the required record is found.
- **Traverse:** Visits every employee in the array.
- **Delete:** After removing an employee, the remaining elements must be shifted.

---

## Limitations of Arrays
- Fixed size; cannot grow dynamically.
- Insertion and deletion can be inefficient because elements need to be shifted.
- Wastes memory if many array positions remain unused.
- Stores only a fixed number of elements.

---

## When to Use Arrays
Arrays are suitable when:
- The number of records is known in advance.
- Fast index-based access is required.
- Frequent insertions and deletions are not needed.
- Memory efficiency and simplicity are important.

---

# Technologies Used
- Java
- Arrays
- Data Structures and Algorithms (DSA)

---

# Conclusion
This project demonstrates the implementation of an Employee Management System using arrays. It performs basic employee management operations and analyzes the efficiency of array-based storage. Arrays provide fast access to elements but are limited by their fixed size and slower insertion and deletion operations.