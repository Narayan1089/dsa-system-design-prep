import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 21 — Syntax only: array, ArrayList, HashMap, HashSet (easy, copy-paste friendly)
 *
 * Run: ./run 21_ArrayListMapSetSyntax.java
 *
 * Use this when you forget:
 *   - how to create / add / get / loop
 *   - Map put get containsKey
 *   - Set add contains
 */
class ArrayListMapSetSyntax {

    public static void main(String[] args) {
        demoArray();
        demoArrayList();
        demoHashMap();
        demoHashSet();
        runTinyPractice();
    }

    // ==================== 1. int[] ARRAY (not ArrayList) ====================
    /*
     * int[] a = new int[3];        // size 3, all 0
     * int[] a = { 1, 2, 3 };       // literal
     * a[i] = 5;   a[i]              // read / write
     * a.length                      // NOT .size()
     * for (int i = 0; i < a.length; i++)
     * for (int x : a)
     */
    static void demoArray() {
        System.out.println("===== int[] ARRAY =====");
        int[] nums = { 10, 20, 30 };

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("length = " + nums.length);

        nums[1] = 99; // change one cell
        System.out.println("after nums[1]=99 → " + Arrays.toString(nums));

        System.out.print("loop index: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.print("loop value: ");
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    // ==================== 2. ArrayList / List ====================
    /*
     * List<Integer> list = new ArrayList<>();
     * list.add(10);           // append
     * list.get(0);            // read index
     * list.set(0, 5);         // change index
     * list.size()             // count (NOT length)
     * list.remove(0);          // remove by index
     * list.isEmpty()
     *
     * import: java.util.ArrayList, java.util.List
     */
    static void demoArrayList() {
        System.out.println("===== ArrayList / List =====");
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("whole list: " + list);
        System.out.println("get(1) = " + list.get(1));
        System.out.println("size = " + list.size());

        list.set(0, 100);
        System.out.println("after set(0,100): " + list);

        System.out.print("loop index: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.print("loop value: ");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    // ==================== 3. HashMap / Map ====================
    /*
     * Map<Integer, Integer> map = new HashMap<>();
     * map.put(key, value);     // add or update
     * map.get(key);            // value or null if missing
     * map.containsKey(key);    // true / false
     * map.getOrDefault(key, 0); // value or default if missing
     * map.remove(key);
     * map.size()
     *
     * Count frequency pattern:
     *   map.put(x, map.getOrDefault(x, 0) + 1);
     */
    static void demoHashMap() {
        System.out.println("===== HashMap / Map =====");
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Ada", 25);
        ages.put("Bob", 30);
        ages.put("Ada", 26); // same key → overwrites

        System.out.println("map: " + ages);
        System.out.println("get(\"Bob\") = " + ages.get("Bob"));
        System.out.println("containsKey(\"Zoe\") = " + ages.containsKey("Zoe"));
        System.out.println("get(\"Zoe\") = " + ages.get("Zoe")); // null

        Integer zoe = ages.get("Zoe");
        if (zoe == null) {
            System.out.println("Zoe not in map");
        }

        System.out.println("getOrDefault(\"Zoe\", 0) = " + ages.getOrDefault("Zoe", 0));

        // frequency: how many times each number appears
        int[] arr = { 1, 2, 2, 3, 1 };
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        System.out.println("frequency of " + Arrays.toString(arr) + " → " + freq);

        // Two Sum style: number → index
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        int[] nums = { 2, 7, 11 };
        for (int i = 0; i < nums.length; i++) {
            valueToIndex.put(nums[i], i);
        }
        System.out.println("value 7 at index " + valueToIndex.get(7));
        System.out.println();
    }

    // ==================== 4. HashSet / Set ====================
    /*
     * Set<Integer> set = new HashSet<>();
     * set.add(1);        // add (ignores duplicate)
     * set.contains(1);   // true if present
     * set.size()
     * set.remove(1)
     *
     * No get(i) — sets have NO index order for "get by position"
     */
    static void demoHashSet() {
        System.out.println("===== HashSet / Set =====");
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2); // duplicate → ignored

        System.out.println("set: " + set);
        System.out.println("contains(2) = " + set.contains(2));
        System.out.println("contains(9) = " + set.contains(9));
        System.out.println("size = " + set.size());

        // duplicate check in array
        int[] arr = { 1, 2, 3, 2 };
        Set<Integer> seen = new HashSet<>();
        boolean hasDup = false;
        for (int x : arr) {
            if (seen.contains(x)) {
                hasDup = true;
                break;
            }
            seen.add(x);
        }
        System.out.println("array has duplicate? " + hasDup);
        System.out.println();
    }

    // ==================== 5. Tiny practice (solutions inline) ====================
    static void runTinyPractice() {
        System.out.println("===== TINY PRACTICE (solutions run below) =====\n");

        // P1: make list [5, 10, 15] and print middle element
        List<Integer> p1 = practice_makeList();
        System.out.println("P1 middle = " + p1.get(1) + " (expect 10)");

        // P2: map put name→score, get score
        Map<String, Integer> p2 = practice_makeMap();
        System.out.println("P2 score = " + p2.get("you") + " (expect 100)");

        // P3: set — how many unique in [1,1,2,3,3]
        System.out.println("P3 unique count = " + practice_uniqueCount(new int[] { 1, 1, 2, 3, 3 }) + " (expect 3)");

        // P4: frequency of 2 in [1,2,2,2,3]
        System.out.println("P4 count of 2 = " + practice_countOf(new int[] { 1, 2, 2, 2, 3 }, 2) + " (expect 3)");
    }

    // --- copy these patterns when you practise ---

    static List<Integer> practice_makeList() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        return list;
    }

    static Map<String, Integer> practice_makeMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("you", 100);
        return map;
    }

    static int practice_uniqueCount(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        return set.size();
    }

    static int practice_countOf(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        return freq.getOrDefault(target, 0);
    }
}
