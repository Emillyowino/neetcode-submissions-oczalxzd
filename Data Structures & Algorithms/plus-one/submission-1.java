class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ans = new int[n]; 

        for (int i = 0; i < n; i++) {
            ans[i] = digits[i];
        }

        // need to start from the left - carr etc
        int digit = digits[n - 1];
        int carry = 0;
        if (digit + 1 == 10) {
            ans[n - 1] = 0;
            carry = 1;
        } else {
            ans[n - 1] = digit + 1;
            return ans;
        }

        for (int i = n - 2; i >= 0; i--) {
            digit = digits[i];
            if (digit + carry == 10) { // there's a carry
                ans[i] = 0;
                carry = 1;
            } else {
                ans[i] = digit + carry;
                carry = 0;
                return ans;
            }        
        }

        int[] ans1 = new int[n + 1];
        ans1[0] = 1;
        for (int i = 0; i < n; i++) {
            ans1[i + 1] = ans[i];
        }
        return ans1;
    }
}
