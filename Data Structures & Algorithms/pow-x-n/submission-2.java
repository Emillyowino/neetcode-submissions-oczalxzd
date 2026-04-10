class Solution {
    private double power(double x, int n) {
        double ans = x;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2 - 1; i++) {
                ans *= x;
            }
            ans *= ans;
        } else {
            for (int i = 0; i < n / 2 - 1; i++) {
                ans *= x;
            }
            ans = ans * ans * x;
        }
       
        return ans;
    }

    public double myPow(double x, int n) {
        if (x == 0 || x == 1 || n == 1) {
            return x;
        } 
        if (n == 0) {
            return 1;
        }
        if (n == -1) {
            return 1 / x;
        }
        double ans = 0;
        if (n < 0) {
            ans = 1 / power(x, Math.abs(n));
        } else {
            ans = power(x, n);
        }
        return ans;
    }
}
