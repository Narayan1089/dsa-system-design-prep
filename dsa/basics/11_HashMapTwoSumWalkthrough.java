import java.util.HashMap;
import java.util.Map;

/**
 * Prints HashMap state at each step of Two Sum — same logic as dsa/arrays/TwoSum.java
 *
 * Run: ./run 11_HashMapTwoSumWalkthrough.java
 */
class HashMapTwoSumWalkthrough {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 26;
        twoSumWithTrace(nums, target);
    }

    static void twoSumWithTrace(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        System.out.println("nums = " + java.util.Arrays.toString(nums) + ", target = " + target);
        System.out.println("Map stores:  value (number) → index where we saw it\n");

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            System.out.println("--- i = " + i + ", nums[i] = " + current + " ---");
            System.out.println("  complement = " + target + " - " + current + " = " + complement);
            System.out.println("  seen before get: " + seen);

            Integer earlierIndex = seen.get(complement);
            if (earlierIndex != null) {
                System.out.println("  seen.get(" + complement + ") = " + earlierIndex + "  →  pair found!");
                System.out.println("  answer: [" + earlierIndex + ", " + i + "]");
                return;
            }

            System.out.println("  seen.get(" + complement + ") = null  →  no pair yet");
            seen.put(current, i);
            System.out.println("  seen.put(" + current + ", " + i + ")");
            System.out.println("  seen after put:  " + seen + "\n");
        }

        System.out.println("No pair found.");
    }
}
