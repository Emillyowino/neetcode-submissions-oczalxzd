class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0, n = nums.length - 1; i < n; i++) {
            if (nums[i] == nums[i +1]) {
                return true;
            }
        }
        return false;
    }
}