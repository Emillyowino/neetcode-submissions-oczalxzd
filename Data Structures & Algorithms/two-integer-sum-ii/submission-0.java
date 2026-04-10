class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums2 = new int[2];
        for (int i = 0, j = numbers.length; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (numbers[i] + numbers[k] == target) {
                    nums2[0] = i + 1;
                    nums2[1] = k + 1;
                }
            }
        }
        return nums2;
    }
}
