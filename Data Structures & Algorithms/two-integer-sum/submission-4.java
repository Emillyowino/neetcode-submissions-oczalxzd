class Solution {
    public int[] twoSum(int[] nums, int target) {
        // returning indices so cant sort and then use the 2 pointers!
        // binary search - can only be used in a sorted array!
        // 2 loops
        // do 1 sweep put stuff in a map ; int - index - no duplicates guaranteed
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (map.containsKey(search) && map.get(search) != i) {
                ans[0] = map.get(search);
                ans[1] = i;
                break;
            }
        }
        Arrays.sort(ans);
        return ans;

























        
/* 
        int[] ans = new int[2];
        for (int num : nums) { // n^2
            // we could use 2 for loops
            
            int diff = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                diff = target - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == diff) {
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }
        return ans;

 */
    /*     // binary search
        int diff = 0;
        int i = 0;
        int mid = 0;

        Arrays.sort(nums); // we could now use pointers too?? 
        for (; i < nums.length; i++) {
            diff = target - nums[i];
            // look for diff in the binary search and return the index - nlogn 
            // we'd need to sort first then search
            int h = nums.length;
            int l = i;
            while (l <= h) {
                mid = l + (h - l)/2;
                if (nums[mid] < target) {
                    l = mid;
                } else if (nums[mid] > target) {
                    h = mid;
                } else {
                    break;
                }
            }
        }
        return new int[]{i, mid};
    } */
    }
}
