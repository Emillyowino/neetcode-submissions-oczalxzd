class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            if (map.contains(num)) {
                ans = num;
                break;
            } else {
                map.add(num);
            }
        }
        return ans;
    }
}
