class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0, j = nums.length; i < j; i++) {
            int n = nums[i];
            if (list.contains(n)) {
                list.remove(n);
            } else {
                list.add(n);
            }
        }
        return list.iterator().next();
    }
}

/* class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0, j = nums.length; i < j; i++) {
            int n = nums[i];
            if (list.contains((Object) n)) {
                list.remove((Object) n);
            } else {
                list.add(n);
            }
        }
        return list.get(0);
    }
} */

