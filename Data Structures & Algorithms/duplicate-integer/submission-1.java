class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) { // item not added - has a duplicate
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;
    }
}