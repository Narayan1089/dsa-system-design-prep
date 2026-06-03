/**
 * 18 — Maximum subarray (Kadane's algorithm)
 * Links to: dsa/arrays/MaximumSubarray.java
 *
 * Idea: at each index, either extend previous subarray or start fresh at nums[i]
 *   currentBest = max(nums[i], currentBest + nums[i])
 */
class MaximumSubarrayKadane {

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("max subarray sum = " + maxSubArray(nums)); // 6 → [4,-1,2,1]
    }

    static int maxSubArray(int[] nums) {
        int best = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }
        return best;
    }
}
