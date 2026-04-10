class Solution {
    public int firstMissingPositive(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains((Object) num)) {
                list.add(num);
            }
        }
        for (int i = min; i <= max; i++) {
            if (min > 1) {
                return 1;
            }
            if (i > 0) {
                if (!list.contains((Object) i)) {
                    return i;
                }
            }
        }
        if (max <= 0) {
            return 1;
        }
        return max + 1;
    }
}