class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int count = 0;
        int maj = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, j = nums.length; i < j; i++) {
            int k = nums[i];
            if (map.containsKey(k)) {
                count = map.get(k)+ 1;
                if (count > n) {
                    maj = k;
                    break;
                } else {
                    map.put(k, count);
                }
            } else {
                if (1 > n) {
                    maj = k;
                    break;
                }
                map.put(k, 1);
            }
        }
        return maj;
    }
}