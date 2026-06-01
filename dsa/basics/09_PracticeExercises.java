import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        System.out.println("twoSum indices = " + java.util.Arrays.toString(p.twoSum(new int[] { 2, 7, 11, 15 }, 9))); // [0,1]
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
        // your code here
        return 0;
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
    int[] twoSum(int[] arr, int target) {
        // your code here
        return new int[0];
    }
}
