# Exercise 7: Financial Forecasting

## Overview
The Financial Forecasting project demonstrates the use of recursion to calculate the future value of an investment based on a fixed annual growth rate. It helps understand how recursive algorithms solve problems by breaking them into smaller subproblems.

---

# 1. Understand Recursive Algorithms

## What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a problem. Each recursive call works on a smaller version of the original problem until it reaches a base case, where the recursion stops.

Recursion is useful for solving problems that can be divided into smaller, similar subproblems.

### Advantages of Recursion
- Makes code shorter and easier to understand.
- Suitable for mathematical calculations.
- Simplifies divide-and-conquer algorithms.
- Useful for tree and graph traversals.

### Disadvantages
- May consume more memory due to recursive calls.
- Can be slower than iterative solutions.
- Excessive recursion may cause stack overflow.

---

# 2. Setup

Create a Java project named **Financial Forecasting**.

Create a class named:

- `FinancialForecast.java`

The project contains a recursive method to calculate the future value of an investment.

---

# 3. Implementation

The project implements a recursive algorithm to calculate future value using the formula:

**Future Value = (1 + Growth Rate) × Previous Year's Value**

### Algorithm
1. If the number of years is 0, return the present value.
2. Otherwise, recursively calculate the value for the previous year.
3. Multiply the result by `(1 + growthRate)`.

This process continues until the base case is reached.

---

# 4. Analysis

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Recursive Calculation | O(n) |

where **n** is the number of years.

### Explanation

The recursive method makes one recursive call for each year until the base case is reached.

---

## Optimization

The recursive solution can be optimized by:

- Using **Memoization** to store previously calculated values and avoid repeated computations.
- Using **Dynamic Programming** for larger problems.
- Using an **iterative approach** to reduce memory usage and eliminate recursive call overhead.

These techniques improve performance and prevent excessive computation.

---

# Technologies Used

- Java
- Recursion
- Data Structures and Algorithms (DSA)

---

# Conclusion

This project demonstrates how recursion can be used to predict future financial values based on a constant growth rate. The recursive solution is simple and easy to understand, but for large inputs, optimization techniques such as memoization or iteration are preferred to improve efficiency.