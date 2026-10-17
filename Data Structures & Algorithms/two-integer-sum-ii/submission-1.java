class Solution {
    public int[] twoSum(int[] numbers, int target) {
/* 
        int i = 0;
        int j = numbers.length - 1;
        while (i <= j) {
            if (numbers[i] + numbers[j] > target) {
                i-=1;
            } else if (numbers[i] + numbers[j] < target) {
                j+=1;
            } if { // equal to target
                return int[]{i, j};
            }

        }
        return int[0];
 */

        // use binary search
        int l = 0;
        int h = 0;
        int mid = 0;
        int diff = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            diff = target - numbers[i];
            l = i + 1;
            h = numbers.length - 1;
            while (l <= h) { // finding the other - sorted array
                mid = l + (h - l) / 2;
                if (numbers[mid] > diff) {
                    h = mid - 1;
                } else if (numbers[mid] < diff) {
                    l = mid + 1;
                } else {
                    return new int[]{i + 1, mid + 1};
                }
            }
        }

        return new int[0];
    }
}
