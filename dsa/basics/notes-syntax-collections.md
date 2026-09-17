# Syntax cheat sheet — array, ArrayList, Map, Set

Run: `./run 21_ArrayListMapSetSyntax.java`

---

## int[] array

```java
int[] a = { 1, 2, 3 };
int[] b = new int[5];   // five zeros

a[0] = 10;
int x = a[0];
int n = a.length;       // NOT .size()

for (int i = 0; i < a.length; i++) { }
for (int v : a) { }
```

---

## ArrayList / List

```java
import java.util.ArrayList;
import java.util.List;

List<Integer> list = new ArrayList<>();

list.add(10);           // add end
list.get(0);            // read
list.set(0, 99);        // update
list.size();            // count
list.isEmpty();

for (int i = 0; i < list.size(); i++) {
    list.get(i);
}
for (int v : list) { }
```

---

## HashMap / Map

```java
import java.util.HashMap;
import java.util.Map;

Map<Integer, Integer> map = new HashMap<>();

map.put(2, 0);              // key 2 → value 0
map.get(2);                 // 0, or null if missing
map.containsKey(2);         // true
map.getOrDefault(9, -1);    // -1 if key 9 missing

// count frequency (very common)
map.put(x, map.getOrDefault(x, 0) + 1);
```

---

## HashSet / Set

```java
import java.util.HashSet;
import java.util.Set;

Set<Integer> set = new HashSet<>();

set.add(1);
set.contains(1);    // seen before?
set.size();

// no get(index) — not a list
```

---

## When to use what

| Need | Use |
|------|-----|
| Fixed input from problem | `int[]` |
| Build result, unknown size | `ArrayList` |
| key → value, count, index | `HashMap` |
| unique / duplicate check | `HashSet` |

---

## Imports (copy once per file)

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
```

Next: `20_LoopsArraysCollectionsDrills.java` for more practise.
