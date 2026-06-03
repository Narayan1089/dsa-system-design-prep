import java.util.Arrays;

/**
 * 14 — Two pointers (same array, two indices)
 *
 * Patterns:
 *   - Opposite ends (sorted array): left=0, right=n-1
 *   - Same direction (fast/slow): cycle detection, remove duplicates
 *
 * Example: pair in SORTED array that sums to target (Two Sum II style)
 */
class TwoPointersBasics {

    public static void main(String[] args) {
        int[] sorted = { 1, 2, 4, 6, 10 };
        int target = 8;
        int[] pair = twoSumSorted(sorted, target);
        System.out.println("sorted two-sum " + target + " → " + Arrays.toString(pair));

        int[] arr = { 1, 1, 2, 2, 3 };
        System.out.println("remove dup length = " + removeDuplicates(arr));
        System.out.println("array after = " + Arrays.toString(Arrays.copyOf(arr, removeDuplicates(arr))));
    }

    /** Sorted array: move left/right based on sum vs target — O(n) */
    static int[] twoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    /** In-place: keep unique prefix — O(n) */
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int write = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[read - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}
