class Solution {
    public int[] twoSum(int[] nums, int target) {
        int target1 = 0;
        HashMap<Integer, Integer> st = new HashMap<>();
        for (int i = 0, j = nums.length; i < j; i++) {
            int n = nums[i];
            target1 = target - n; 
            if (st.containsKey(target1)) {
                int[] indices = {st.get(target1), i};
                Arrays.sort(indices);
                return indices;
            } else {
                st.put(n, i);
            }
        }
        return new int[2];
    }
}
