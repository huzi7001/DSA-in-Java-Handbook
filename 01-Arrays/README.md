# Arrays in Java

## Overview
An array is a fixed-size, indexed data structure that stores elements of the same type in contiguous memory locations.

Arrays are useful when:
- fast access by index is needed
- data size is known in advance
- simple traversal, insertion, deletion, and update operations are required

---

## Key Idea
- Index starts from `0`
- Elements are stored in sequence
- All elements must be of the same type
- Array size is fixed after creation

---

## Main Operations

| Operation | Description | Time Complexity |
|----------|-------------|-----------------|
| Traversal | Visit each element one by one | O(n) |
| Insertion | Add an element at a specific position | O(n) |
| Deletion | Remove an element from a specific position | O(n) |
| Update | Replace an element at a specific index | O(1) |
| Access | Read an element using index | O(1) |

---

## Files in This Folder

- `ArrayBasics.java` → basic array creation and display
- `Traversal.java` → print all array elements
- `Insertion.java` → insert an element at a position
- `Deletion.java` → delete an element from a position
- `Update.java` → update an element at a position

---

## When to Use Arrays
Use arrays when:
- the number of elements is known or almost fixed
- you need direct access by index
- you want simple and fast read operations

---

## Limitations
- fixed size
- insertion and deletion are costly because elements must be shifted
- all elements must have the same data type

---

## Summary
Arrays are one of the most important data structures in DSA.  
They are simple, efficient for access, and form the base of many other structures and algorithms.
