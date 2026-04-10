class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[k];
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            arr.add(new int[] {value, key});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        for (int i = 0; i < k; i++) {
            ans[i] = arr.get(i)[1];
        }
        return ans;
    }
}
