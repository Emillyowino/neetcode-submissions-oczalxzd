class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1; // do i use long?
        int count = 0; 
        for (int num : nums) {
            if (num == 0) count += 1;
        }

        for (int num : nums) {
            if (num != 0) {
                product *= num;
            }
        }

        if (count >= 2) {
            return new int[nums.length];
        }

        if (count == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] = 0;
                } else {
                    nums[i] = product;
                }             
            }
        } else { // count is 0 - no div by 0
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                nums[i] = product / temp;
            }
        }
        return nums;

        































        /* int n = nums.length;
        int[] products = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            product = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                product *= nums[j];
            }
            products[i] = product;
        }
        return products; */
    }
}  
