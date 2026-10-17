class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int num : nums) {
            // we could use 2 for loops
            // binary search
            int diff = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                diff = target - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == diff) {
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }
        return ans;
    }
}
