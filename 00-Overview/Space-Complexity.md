# Space Complexity

## What is Space Complexity?

Space complexity is the amount of memory required by an algorithm to run efficiently.

It includes:
- input storage
- auxiliary space
- temporary variables
- recursive stack space

---

## Why Space Complexity is Important

Even if an algorithm is fast, it may use too much memory.

A good algorithm should balance:
- time
- memory

This is especially important in large-scale applications.

---

## Components of Space Complexity

Space complexity has two main parts:

### 1. Fixed Part
This part does not depend on the input size.

Examples:
- simple variables
- constants
- program instructions

### 2. Variable Part
This part depends on the input size.

Examples:
- dynamically allocated memory
- recursion stack
- arrays created during execution

---

## Auxiliary Space

Auxiliary space is the extra memory used by an algorithm besides the input data.

Example:
- temporary variables
- extra arrays
- recursive calls

---

## Space Complexity Formula

Space complexity is often written as:

`S(P) = C + SP(I)`

Where:
- **C** = fixed part
- **SP(I)** = variable part depending on input instance

---

## How to Analyze Space Complexity

To analyze space complexity:

1. Identify all variables used
2. Count extra memory used during execution
3. Consider recursion if present
4. Express memory usage in terms of input size **n**
5. Remove constants and keep dominant terms

---

## Common Space Complexities

### O(1) - Constant Space
The algorithm uses fixed memory.

Example:
- swapping two variables
- simple arithmetic operations

### O(n) - Linear Space
Memory grows with input size.

Example:
- storing an array of n elements
- copying data into another array

### O(log n)
Used in recursive algorithms like binary search due to recursion stack.

---

## Space Complexity of Common Algorithms

### Linear Search
- O(1) extra space

### Binary Search
- O(1) if iterative
- O(log n) if recursive

### Bubble Sort
- O(1) extra space

### Quick Sort
- O(log n) average recursion stack
- O(n) worst case recursion stack

### Merge Sort
- O(n) extra space

---

## Time vs Space Complexity

### Time Complexity
Measures how much time an algorithm takes.

### Space Complexity
Measures how much memory an algorithm uses.

Both are important when designing efficient programs.

---

## Example

Suppose an algorithm uses:
- 3 integer variables
- 1 array of size n

Then:
- fixed space = constant
- variable space = O(n)

So the overall space complexity is:

`O(n)`

---

## Summary

Space complexity tells us how much memory an algorithm needs.  
An efficient algorithm should use minimal extra memory while still solving the problem correctly.

Understanding space complexity helps in:
- memory optimization
- writing better code
- choosing the right algorithm for large input
