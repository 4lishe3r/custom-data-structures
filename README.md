# Java Data Structures

Simple implementations of common data structures without using `java.util.*`.

## What's Included

### Core Structures
- **MyArrayList** - Like ArrayList (dynamic array)
- **MyLinkedList** - Doubly-linked list

### Wrapper Structures
- **MyStack** (uses MyLinkedList)
- **MyQueue** (uses MyLinkedList)
- **MyMinHeap** (uses MyArrayList)

## Why These Choices?
- Stacks/Queues need fast add/remove → LinkedList
- Heaps need index access → ArrayList

## Quick Examples

```java
// Stack
MyStack<String> stack = new MyStack<>();
stack.push("Hello");
stack.pop(); // returns "Hello"

// Queue
MyQueue<Integer> queue = new MyQueue<>();
queue.enqueue(1);
queue.dequeue(); // returns 1

// MinHeap
MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.insert(5);
heap.extractMin(); // returns 5
