# Linked Lists in Java

## Overview

A Linked List is a **dynamic linear data structure** where elements (nodes) are connected using links (references).

Unlike arrays, linked lists do not require contiguous memory and can grow or shrink dynamically.

This folder covers the two most important types of linked lists:

- Singly Linked List
- Doubly Linked List

---

# Singly Linked List

## What is a Singly Linked List?

A Singly Linked List consists of nodes where each node contains:

- Data
- Reference to the next node

The last node points to `null`.

### Node Structure

```
Data | Next
```

### Characteristics

- Dynamic size
- Sequential access
- Efficient insertion and deletion
- One-way traversal

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Traversal | O(n) |
| Searching | O(n) |
| Insertion (Beginning) | O(1) |
| Insertion (End) | O(n) |
| Deletion (Beginning) | O(1) |
| Deletion (End) | O(n) |

---

# Doubly Linked List

## What is a Doubly Linked List?

A Doubly Linked List consists of nodes where each node contains:

- Previous reference
- Data
- Next reference

It supports traversal in both forward and backward directions.

### Node Structure

```
Previous | Data | Next
```

### Characteristics

- Bidirectional traversal
- Easier deletion
- More memory usage
- Dynamic size

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Traversal | O(n) |
| Searching | O(n) |
| Insertion (Beginning) | O(1) |
| Insertion (End) | O(n) |
| Deletion | O(1)* |

*Deletion is O(1) when the node reference is already available.

---

# Singly vs Doubly Linked List

| Feature | Singly | Doubly |
|---------|---------|---------|
| Number of Links | One | Two |
| Traversal | Forward Only | Forward & Backward |
| Memory Usage | Less | More |
| Insertion | Easy | Easy |
| Deletion | Slightly Difficult | Easier |

---

# Files

- `SinglyLinkedList.java` → Basic implementation of a singly linked list
- `DoublyLinkedList.java` → Basic implementation of a doubly linked list

---

# Learning Outcomes

After completing this folder, you will be able to:

- Understand linked list structure.
- Create singly and doubly linked lists.
- Traverse linked lists.
- Insert nodes.
- Delete nodes.
- Search for elements.

---

# Summary

Linked Lists provide dynamic memory allocation and efficient insertion/deletion operations.

- Use **Singly Linked List** when forward traversal is sufficient.
- Use **Doubly Linked List** when traversal in both directions is required.