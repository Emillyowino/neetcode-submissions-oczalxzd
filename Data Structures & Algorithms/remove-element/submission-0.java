class Solution {
    private void reverseSort(int[] nums, int length) {
        for (int i = 0, k = length - 1; i < length / 2; i++, k--) {
            int n = nums[k];
            nums[k] = nums[i];
            nums[i] = n;
        }
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int n = nums[i];
            if (n == val) {
                nums[i] = 0;
                count++;
            }
        }
        Arrays.sort(nums);
        reverseSort(nums, length);
        return length - count;
    }
}