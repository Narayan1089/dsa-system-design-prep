import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 08 — Collections used constantly in DSA (Two Sum, Contains Duplicate, etc.)
 *
 * ArrayList<E>  → resizable array; use when size changes or you add often
 * HashMap<K,V>  → key → value; O(1) average get/put (Two Sum: value → index)
 * HashSet<E>    → unique elements; O(1) average contains (duplicates)
 *
 * SYNTAX:
 *   List<Integer> list = new ArrayList<>();
 *   list.add(10);  list.get(0);  list.size();
 *
 *   Map<String, Integer> map = new HashMap<>();
 *   map.put("a", 1);  map.get("a");  map.containsKey("a");
 *
 *   Set<Integer> set = new HashSet<>();
 *   set.add(1);  set.contains(1);
 */
class ArrayListAndHashMap {

    public static void main(String[] args) {

        // --- ArrayList ---
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println("ArrayList: " + nums);
        System.out.println("get(1) = " + nums.get(1));
        System.out.println("size = " + nums.size());

        // Loop: index OR enhanced for
        for (int i = 0; i < nums.size(); i++) {
            System.out.println("  index " + i + " → " + nums.get(i));
        }

        // --- HashMap (like Two Sum's "seen") ---
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        int[] arr = { 2, 7, 11, 15 };
        for (int i = 0; i < arr.length; i++) {
            valueToIndex.put(arr[i], i);
        }
        System.out.println("map get(7) → index " + valueToIndex.get(7));

        // get returns null if key missing — check before use
        Integer missing = valueToIndex.get(99);
        if (missing == null) {
            System.out.println("key 99 not in map");
        }

        // --- HashSet (duplicate check) ---
        Set<Integer> seen = new HashSet<>();
        int[] withDup = { 1, 2, 3, 2 };
        boolean hasDuplicate = false;
        for (int n : withDup) {
            if (seen.contains(n)) {
                hasDuplicate = true;
                break;
            }
            seen.add(n);
        }
        System.out.println("has duplicate? " + hasDuplicate);
    }
}
