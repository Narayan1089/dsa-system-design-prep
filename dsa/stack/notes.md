# Stack — theory for DSA

## What it is

A **stack** is **LIFO**: **L**ast **I**n, **F**irst **O**ut.

Think: pile of plates — you add/remove only from the **top**.

```
push(3) push(7) push(1)     pop() → 1
        top → 1
              7
              3
```

## Core operations

| Operation | Meaning | Typical time |
|-----------|---------|--------------|
| `push(x)` | Add on top | O(1) |
| `pop()` | Remove top | O(1) |
| `peek()` / `top()` | See top without removing | O(1) |
| `isEmpty()` | Any elements? | O(1) |

## Java

```java
import java.util.ArrayDeque;
import java.util.Deque;

Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);
stack.push(20);
int top = stack.peek();   // 20
int out = stack.pop();    // 20
```

Use **`ArrayDeque`** for stack (not old `Stack` class — it’s synchronized and slower).

## When problems use a stack

| Pattern | Example idea |
|---------|----------------|
| Matching brackets | `(` must close with `)` — push opens, pop on close |
| Monotonic stack | Next greater element, daily temperatures |
| DFS / recursion | Call stack is literally a stack |
| Reverse order | Process from end, or undo steps |
| Expression eval | Postfix, calculators |

## Classic problems (your `dsa/stack/` folder)

- Valid Parentheses
- Min Stack
- Daily Temperatures
- Largest Rectangle in Histogram

## Stack vs recursion

Recursive DFS uses the **call stack**. An explicit `Deque` stack does the same order **iteratively** (useful to avoid stack overflow on deep graphs).

## Complexity reminder

- Each element pushed/popped at most once → often **O(n)** total for one pass with a stack.
