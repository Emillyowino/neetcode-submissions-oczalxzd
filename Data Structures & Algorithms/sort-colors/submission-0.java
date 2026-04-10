class Solution {
    public void sortColors(int[] nums) {
        int[] array = new int[3];
        for (int i = 0, j = nums.length; i < j; i++) {
            int n = nums[i];
            array[n]++;
        }
        for (int i = 0, j = array[0]; i < j; i++) {
            nums[i] = 0;
        }
        for (int i = array[0], j = array[0] + array[1]; i < j; i++) {
            nums[i] = 1;
        }
        for (int i = array[0] + array[1], j = nums.length; i < j; i++) {
            nums[i] = 2;
        }
    }
}