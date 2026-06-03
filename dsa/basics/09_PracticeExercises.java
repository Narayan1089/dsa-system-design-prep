import java.util.HashMap;
import java.util.Map;

/**
 * 09 — TODO: fill in the methods, then run this file to check.
 *
 * How to run (from dsa/basics):
 *   ./run 09_PracticeExercises.java
 *
 * Or use Cursor: Terminal → Run Task → "▶ Run Java file" (see README)
 */
class PracticeExercises {

    public static void main(String[] args) {
        PracticeExercises p = new PracticeExercises();

        System.out.println("sum(1,2,3) = " + p.sumArray(new int[] { 1, 2, 3 }));           // expect 6
        System.out.println("max = " + p.findMax(new int[] { 3, 9, 1 }));                   // expect 9
        System.out.println("reverse = " + java.util.Arrays.toString(p.reverse(new int[] { 1, 2, 3 }))); // [3,2,1]
        System.out.println("hasDup = " + p.hasDuplicate(new int[] { 1, 2, 3, 2 }));        // true
        int[] sample = { 2, 11, 8, 15 };
        int target = 26;
        System.out.println("twoSum (HashMap)  = " + java.util.Arrays.toString(p.twoSum(sample, target)));
        System.out.println("twoSum (brute)     = " + java.util.Arrays.toString(p.twoSumBruteForce(sample, target)));
    }

    // TODO 1: return sum of all elements (use a loop)
    int sumArray(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
        // your code here
    }

    // TODO 2: return largest element
    int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // TODO 3: return new array with elements in reverse order
    int[] reverse(int[] arr) {
        
        // your code here
        return new int[0];
    }

    // TODO 4: return true if any value appears twice (hint: HashSet)
    boolean hasDuplicate(int[] arr) {
        // your code here
        return false;
    }

    // TODO 5: return indices [i, j] where arr[i] + arr[j] == target (hint: HashMap)

    /** Brute force: try every pair (i, j). Time O(n²), space O(1). */
    int[] twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    /** One pass + HashMap. Time O(n), space O(n). */
    // int[] twoSum(int[] arr, int target) {
    //     Map<Integer, Integer> seen = new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         int need = target - arr[i];
    //         if (seen.containsKey(need)) 
    //             return new int[] { seen.get(need), i };
    //         seen.put(arr[i], i);
    //     }
    //     return new int[0];
    // }

     int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int need = target - arr[i];
            if(seen.containsKey(need)) 
                return new int[] { seen.get(need), i};
            seen.put(arr[i], i);
        }
        
        return new int[0];

    }
}
