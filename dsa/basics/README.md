# Java basics (for DSA prep)

Start here before LeetCode-style problems. Each file = one topic with comments + runnable `main`.

## Run without typing `javac` + `java` every time

### Option A — One command in terminal (easiest)

From `dsa/basics`:

```bash
./run 01_HelloWorld.java
./run 05_Loops          # .java added automatically
```

From anywhere in the repo:

```bash
bash scripts/run-java.sh dsa/basics/08_ArrayListAndHashMap.java
```

### Option B — Cursor / VS Code task (recommended)

1. Open any `.java` file (e.g. `01_HelloWorld.java`).
2. **Run → Run Build Task**  
   - Mac: `Cmd + Shift + B`  
   - Windows/Linux: `Ctrl + Shift + B`
3. Pick **▶ Run Java file** — compiles and runs the file you have open.

This uses `scripts/run-java.sh` (works even when filename ≠ class name).

### Option C — Java Extension Pack (green Run link)

1. Install extension: **Extension Pack for Java** (Microsoft) — Cursor may prompt via `.vscode/extensions.json`.
2. Install a JDK if needed ([Adoptium](https://adoptium.net/) or `brew install openjdk`).
3. Open a basics file → click **Run** above `public static void main`.

### Option D — Code Runner extension

1. Install **Code Runner**.
2. Open a `.java` file → **Run Code**  
   - Mac: `Ctrl + Option + N`  
   - Windows: `Ctrl + Alt + N`

Repo already configures Code Runner to use `scripts/run-java.sh`.

---

## Manual run (if you prefer)

```bash
cd dsa/basics
javac 01_HelloWorld.java && java HelloWorld
```

---

## Order to read

| # | File | What you learn |
|---|------|----------------|
| 1 | `01_HelloWorld.java` | Class, `main`, `println` |
| 2 | `02_VariablesAndTypes.java` | `int`, `double`, `boolean`, `String`, `final` |
| 3 | `03_Operators.java` | `+ - * / %`, comparisons, `&& \|\| !` |
| 4 | `04_Conditionals.java` | `if / else`, `switch` |
| 5 | `05_Loops.java` | `for`, `while`, `do-while`, enhanced `for` |
| 6 | `06_Arrays.java` | Create, index, `length`, 2D — **core for DSA** |
| 7 | `07_Methods.java` | Parameters, `return`, overload |
| 8 | `08_ArrayListAndHashMap.java` | `List`, `Map`, `Set` — **Two Sum tools** |
| 9 | `09_PracticeExercises.java` | **TODO** exercises (try first) |
| — | `09_PracticeExercises_Solutions.java` | Answers (peek after trying) |
| 10 | `10_OOPBasics.java` | Class, object, constructor, `static` |

Then open `dsa/arrays/TwoSum.java` and trace each line back to these lessons.
