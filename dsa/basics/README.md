# Java basics (for DSA prep)

Start here before LeetCode-style problems. Each file = one topic with comments + runnable `main`.

## Run without typing `javac` + `java` every time

### Option A — One command in terminal (easiest)

From `dsa/basics`:

```bash
./run 01_HelloWorld.java
./run 12_Stack
```

From anywhere in the repo:

```bash
bash scripts/run-java.sh dsa/basics/12_Stack.java
```

### Option B — Cursor / VS Code task (recommended)

1. Open any `.java` file (e.g. `01_HelloWorld.java`).
2. **Run → Run Build Task**  
   - Mac: `Cmd + Shift + B`  
   - Windows/Linux: `Ctrl + Shift + B`
3. Pick **▶ Run Java file** — compiles and runs the file you have open.

### Option C — Java Extension Pack (green Run link)

Install **Extension Pack for Java** + JDK → click **Run** above `main`.

### Option D — Code Runner

`Ctrl + Option + N` (Mac) — uses `scripts/run-java.sh`.

---

## Learning path

### Part 1 — Language (01–07)

| # | File | Topic |
|---|------|--------|
| 1 | `01_HelloWorld.java` | Class, `main`, `println` |
| 2 | `02_VariablesAndTypes.java` | Types, `final` |
| 3 | `03_Operators.java` | Math, compare, logical |
| 4 | `04_Conditionals.java` | `if`, `switch` |
| 5 | `05_Loops.java` | `for`, `while` |
| 6 | `06_Arrays.java` | `int[]`, indices |
| 7 | `07_Methods.java` | Parameters, `return` |

### Part 2 — Collections & Two Sum (08–11)

| # | File | Topic |
|---|------|--------|
| 8 | `08_ArrayListAndHashMap.java` | `List`, `Map`, `Set` |
| 9 | `09_PracticeExercises.java` | Practice (collections) |
| — | `09_PracticeExercises_Solutions.java` | Answers |
| 10 | `10_OOPBasics.java` | Classes, objects |
| 11 | `11_HashMapTwoSumWalkthrough.java` | Two Sum trace |
| — | `notes-hashmap-two-sum.md` | HashMap + diagram |

### Part 3 — DSA patterns (12–19)

| # | File | Topic | Problem folder |
|---|------|--------|----------------|
| 12 | `12_Stack.java` | `ArrayDeque` stack, brackets | `dsa/stack/` |
| 13 | `13_Queue.java` | Queue, BFS idea | `dsa/queue/` |
| 14 | `14_TwoPointers.java` | Sorted pair, remove dups | `dsa/two-pointers/` |
| 15 | `15_SlidingWindow.java` | Fixed & variable window | `dsa/sliding-window/` |
| 16 | `16_Recursion.java` | Base case, call stack | `dsa/recursion/` |
| 17 | `17_LinkedListNode.java` | `ListNode`, reverse | `dsa/linked-list/` |
| 18 | `18_MaximumSubarrayKadane.java` | Kadane algorithm | `dsa/arrays/MaximumSubarray.java` |
| 19 | `19_DsaPractice.java` | TODO: stack, window, list | — |
| — | `19_DsaPractice_Solutions.java` | Answers |

### Part 4 — LeetCode-style (topic folders)

| Folder | Files |
|--------|--------|
| `dsa/arrays/` | `TwoSum.java`, `MaximumSubarray.java` |
| `dsa/hashing/` | `ContainsDuplicate.java` |
| `dsa/stack/` | `ValidParentheses.java` |

Theory notes: `dsa/stack/notes.md`, `dsa/queue/notes.md`

---

## Suggested order after HashMap

1. Run **12 → 13 → 14 → 15** (stack, queue, two pointers, sliding window)  
2. **16 → 17** (recursion, linked list)  
3. **18** then implement `dsa/arrays/MaximumSubarray.java`  
4. **19** practice, then problems in `dsa/*/`
