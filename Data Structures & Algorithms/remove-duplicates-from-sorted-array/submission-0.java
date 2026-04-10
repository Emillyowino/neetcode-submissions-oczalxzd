class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> array = new ArrayList<>();
        int i = 0;
        for (int num : nums) {
            if (!stack.contains(num)) {
                nums[i] = num;
                // array.add(num);
                stack.push(num);
                i++;
            }
        }
        for (int j = i; i < nums.length; i++) {
            nums[j] = 0;
        }
        return stack.size();
    }
}