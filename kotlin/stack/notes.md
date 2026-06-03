# Stack (Kotlin)

Theory: see `dsa/stack/notes.md`

```kotlin
val stack = ArrayDeque<Int>()
stack.addLast(10)
stack.addLast(20)
stack.last()      // peek
stack.removeLast() // pop
```

Use `ArrayDeque` for stack (not legacy `Stack` class).
