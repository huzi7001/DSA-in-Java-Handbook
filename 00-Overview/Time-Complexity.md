# Time Complexity

## What is Time Complexity?

Time complexity is a way to measure how much time an algorithm takes to complete as the size of input increases.

It does not represent exact execution time in seconds.  
Instead, it describes how the number of operations grows with the input size.

---

## Why Time Complexity is Important

Time complexity helps us compare algorithms and choose the most efficient one.

A good algorithm should:
- solve the problem correctly
- use less time
- handle large input efficiently

---

## Input Size

Time complexity is usually written in terms of **n**, where **n** represents the size of the input.

Example:
- if an array has 10 elements, then n = 10
- if an array has 1000 elements, then n = 1000

---

## Types of Time Complexity Cases

### 1. Best Case
The minimum amount of time an algorithm can take.

### 2. Average Case
The average time taken by an algorithm for typical input.

### 3. Worst Case
The maximum amount of time an algorithm can take.

---

## Asymptotic Analysis

Asymptotic analysis is used to study how an algorithm performs when the input size becomes very large.

It helps us ignore:
- machine speed
- compiler differences
- minor constant factors

and focus only on the growth rate of the algorithm.

---

## Asymptotic Notations

### 1. Big O Notation: O()
Big O represents the **upper bound** of an algorithm’s running time.  
It usually describes the worst-case performance.

Examples:
- O(1)
- O(log n)
- O(n)
- O(n log n)
- O(n²)

### 2. Omega Notation: Ω()
Omega represents the **lower bound** of an algorithm’s running time.  
It usually describes the best-case performance.

### 3. Theta Notation: Θ()
Theta represents both the upper and lower bound.  
It describes the exact growth rate when best and worst bounds are same.

---

## Common Time Complexities

### O(1) - Constant Time
The algorithm takes the same time regardless of input size.

Example:
- accessing an array element by index

### O(log n) - Logarithmic Time
The problem size is reduced repeatedly by half.

Example:
- binary search

### O(n) - Linear Time
Time increases directly with input size.

Example:
- linear search

### O(n log n)
Common in efficient sorting algorithms.

Example:
- merge sort
- quick sort (average case)

### O(n²) - Quadratic Time
Time grows as the square of input size.

Example:
- bubble sort
- selection sort

### O(n³) - Cubic Time
Used in nested loops with three levels.

---

## Time Complexity of Common Operations

### Array Access
- O(1)

### Linear Search
- Best Case: O(1)
- Worst Case: O(n)

### Binary Search
- Best Case: O(1)
- Worst Case: O(log n)

### Bubble Sort
- Best Case: O(n) if optimized
- Average Case: O(n²)
- Worst Case: O(n²)

---

## Factors That Affect Time Complexity

- number of loops
- nested loops
- recursive calls
- number of comparisons
- number of swaps

---

## How to Analyze Time Complexity

To analyze time complexity:

1. Count the number of operations
2. Express them in terms of input size **n**
3. Remove constants and lower-order terms
4. Keep the dominant term only

Example:

If an algorithm takes:

`3n + 10`

its time complexity is:

`O(n)`

If an algorithm takes:

`n² + 5n + 20`

its time complexity is:

`O(n²)`

---

## Summary

Time complexity tells us how fast an algorithm runs as the input grows.  
It is one of the most important tools for comparing algorithms and writing efficient programs.
