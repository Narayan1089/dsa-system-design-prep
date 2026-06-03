# Queue — theory for DSA

## What it is

A **queue** is **FIFO**: **F**irst **I**n, **F**irst **O**ut.

Think: line at a ticket counter — join at **back**, serve from **front**.

```
offer(3) offer(7) offer(1)     poll() → 3
front → 3  7  1 ← back
```

## Core operations

| Operation | Meaning | Typical time |
|-----------|---------|--------------|
| `offer(x)` / `add(x)` | Add at back | O(1) |
| `poll()` / `remove()` | Remove from front | O(1) |
| `peek()` | Front element, no remove | O(1) |
| `isEmpty()` | Any elements? | O(1) |

## Java

```java
import java.util.ArrayDeque;
import java.util.Queue;

Queue<Integer> q = new ArrayDeque<>();
q.offer(10);
q.offer(20);
int front = q.peek();   // 10
int out = q.poll();     // 10
```

Again prefer **`ArrayDeque`** (fast, no null issues like `LinkedList` for simple queues).

## Deque (double-ended queue)

Can add/remove **both ends** — used for BFS, sliding window, monotonic queue.

```java
Deque<Integer> dq = new ArrayDeque<>();
dq.offerLast(1);
dq.offerFirst(0);
dq.pollFirst();
dq.pollLast();
```

## When problems use a queue

| Pattern | Example idea |
|---------|----------------|
| **BFS** on graph/tree | Level-order traversal, shortest path (unweighted) |
| **Sliding window** | Sometimes `Deque` for max/min in window |
| **Scheduling / simulation** | Process in arrival order |
| **Multi-source BFS** | Rotting oranges, walls and gates |

## BFS sketch (tree level order)

```
        1
       / \
      2   3

queue: [1] → poll 1, offer 2,3 → poll 2, offer children → ...
```

Visit nodes **level by level** — queue guarantees “older” nodes leave first.

## Stack vs queue (quick)

| | Stack | Queue |
|---|--------|--------|
| Order | LIFO | FIFO |
| Typical use | Undo, brackets, DFS | BFS, scheduling |
| “Next” to process | Top | Front |

## Classic problems (your `dsa/queue/` folder)

- Binary Tree Level Order Traversal
- Number of Islands (BFS)
- Sliding Window Maximum (deque)
- Design Circular Queue

## Complexity reminder

- BFS: **O(V + E)** vertices + edges; each node enqueued/dequeued once.
- Space: queue can hold up to a **level** of the tree (up to ~n/2 in a balanced tree).
