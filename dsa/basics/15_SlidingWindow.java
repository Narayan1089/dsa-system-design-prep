/**
 * 15 — Sliding window (subarray with fixed or variable size)
 *
 * Fixed window size k:
 *   - Add nums[right] to window sum
 *   - When window has k elements, update answer, subtract nums[left]
 *
 * Variable window: expand right until invalid, then shrink left
 */
class SlidingWindowBasics {

    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        System.out.println("max sum of " + k + " consecutive = " + maxSumFixedWindow(nums, k));

        int[] nums2 = { 1, 2, 1, 0, 1, 1, 2 };
        System.out.println("longest subarray with at most 2 distinct = "
                + longestWithAtMostKDistinct(nums2, 2));
    }

    /** Fixed window size k — O(n) */
    static int maxSumFixedWindow(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int best = windowSum;
        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right] - nums[right - k];
            best = Math.max(best, windowSum);
        }
        return best;
    }

    /** Variable window + frequency map — template for many problems */
    static int longestWithAtMostKDistinct(int[] nums, int k) {
        int[] freq = new int[20001]; // simple freq table for small ints
        int distinct = 0;
        int left = 0;
        int best = 0;
        for (int right = 0; right < nums.length; right++) {
            if (freq[nums[right]] == 0) {
                distinct++;
            }
            freq[nums[right]]++;

            while (distinct > k) {
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) {
                    distinct--;
                }
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
