class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int diff = 0;
        for (int i = 0, j = nums.length; i < j; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                diff = Math.abs(map.get(n) - i);
                if (diff <= k) {
                    return true;
                } else {
                    map.put(n, i);
                }
            } else {
                map.put(n, i);
            }
        }
        return false;
    }
}