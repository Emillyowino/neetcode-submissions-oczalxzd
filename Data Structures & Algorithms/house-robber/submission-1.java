class Solution {
    public int rob(int[] nums) {
        // CONSIDERING EVEN VS ODD POSITIONED SUM? - TRIVIAL!! {0, 9, 8, 3, 9} BREAK HERE
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] ans = new int[nums.length];

        // ans[i] - max u can rob from house 0 through i
        ans[0] = nums[0];
        ans[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            ans[i] = Math.max(ans[i - 1], nums[i] + ans[i - 2]);
        }
        return ans[nums.length - 1];

    }
}
