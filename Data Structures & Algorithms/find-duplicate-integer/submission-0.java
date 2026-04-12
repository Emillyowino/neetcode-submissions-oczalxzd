class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                ans = num;
                break;
            } else {
                map.put(num, 1);
            }
        }
        return ans;
    }
}
