class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            int k = map.get(num);
            if (k > n) {
                if (!list.contains((Object) num)) {
                    list.add(num);
                }
            }
        }
        return list;
    }
}