class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
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
        return products;
    }
}  
