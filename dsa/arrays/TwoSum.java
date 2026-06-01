public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        java.util.HashMap<Integer, Integer> seen = new java.util.HashMap<>(nums.length * 2);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer index = seen.get(complement);
            if (index != null) {
                return new int[] {index, i};
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }
}
