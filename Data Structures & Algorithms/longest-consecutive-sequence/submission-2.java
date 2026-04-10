class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 0, j = n - 1; i < j; i++) {
            if ((nums[i + 1] - nums[i]) == 1) {
                count++;
                max = Math.max(max, count);
            } else if ((nums[i + 1] - nums[i]) != 0){
                max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}
