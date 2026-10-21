class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // sort the array - make the counts in a key - record them
        // an array of size k 
        // problem how can i keep track of k max items? - sort the keys by values? 
        // sort the values of the key - access the keys - is thi spossible?
        // sliding window

        List<Integer>[] freq = new ArrayList[nums.length + 1];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // populate the frequency
        for (Integer n : map.keySet()) {
            int f = map.get(n);
            freq[f].add(n);
        }

        int[] ans = new int[k];
        int z = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            while (z < k && !freq[i].isEmpty()) {
                ans[z] = freq[i].remove(0);
                z += 1;
            }             
        }
        return ans;
       

































       /*  Map<Integer, Integer> map = new HashMap<>();
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
    } */
    }
}
