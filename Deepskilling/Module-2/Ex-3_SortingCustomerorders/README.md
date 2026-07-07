# Exercise 3: Sorting Customer Orders

## Overview
This project demonstrates the implementation of sorting algorithms using Java. It sorts customer orders based on their total price, helping prioritize high-value orders. The project compares Bubble Sort and Quick Sort to understand their efficiency and performance.

---

# 1. Understand Sorting Algorithms

## Bubble Sort
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. This process continues until the entire array is sorted.

### Advantages
- Simple to understand and implement.
- Suitable for small datasets.

### Disadvantages
- Slow for large datasets.
- Performs many unnecessary comparisons.

---

## Insertion Sort
Insertion Sort builds the sorted array one element at a time by inserting each element into its correct position.

### Advantages
- Efficient for small or nearly sorted datasets.
- Easy to implement.

### Disadvantages
- Not suitable for large datasets.

---

## Quick Sort
Quick Sort is a divide-and-conquer algorithm. It selects a pivot element and partitions the array into smaller subarrays, then recursively sorts them.

### Advantages
- Very fast for large datasets.
- Efficient average-case performance.

### Disadvantages
- Worst-case performance occurs when the pivot is poorly chosen.

---

## Merge Sort
Merge Sort divides the array into two halves, recursively sorts each half, and then merges them into a sorted array.

### Advantages
- Stable sorting algorithm.
- Guaranteed O(n log n) time complexity.

### Disadvantages
- Requires additional memory.

---

# 2. Setup

Create a Java project named **Sorting Customer Orders**.

Create the following classes:

- `Order.java`
- `SortingOrders.java`

The `Order` class contains:
- Order ID
- Customer Name
- Total Price

---

# 3. Implementation

## Bubble Sort
Bubble Sort compares adjacent orders and swaps them if they are in the wrong order based on total price.

## Quick Sort
Quick Sort selects a pivot element, partitions the array, and recursively sorts the subarrays.

The project stores customer orders in an array and sorts them using both algorithms.

---

# 4. Analysis

## Time Complexity

| Case | Bubble Sort | Quick Sort |
|------|-------------|------------|
| Best Case | O(n) | O(n log n) |
| Average Case | O(n²) | O(n log n) |
| Worst Case | O(n²) | O(n²) |

---

## Comparison

### Bubble Sort
- Simple implementation.
- Suitable for small datasets.
- Performs many comparisons and swaps.

### Quick Sort
- Faster for large datasets.
- Uses divide-and-conquer strategy.
- Better average performance.

---

## Why is Quick Sort Preferred?

Quick Sort is generally preferred because its average time complexity is **O(n log n)**, making it much faster than Bubble Sort for large datasets. It reduces the number of comparisons and efficiently partitions the data into smaller subarrays. Therefore, Quick Sort is widely used in real-world applications such as e-commerce platforms where fast sorting is required.

---

# Conclusion

This project demonstrates the implementation of Bubble Sort and Quick Sort for sorting customer orders by total price. Although Bubble Sort is easy to understand, Quick Sort provides significantly better performance for large datasets and is therefore the preferred sorting algorithm for practical applications.