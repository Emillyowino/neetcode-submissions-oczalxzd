class Solution {
    public boolean hasDuplicate(int[] nums) {
        // to check duplicates, use a set
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;
    }
}