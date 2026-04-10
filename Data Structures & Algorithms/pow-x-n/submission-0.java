class Solution {
    private double power(double x, int n) {
        double ans = x;
        for (int i = 0; i < n - 1; i++) {
            ans *= x;
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
        double ans = 0;
        if (n < 0) {
            n = n * -1;
            ans = 1 / power(x, n);
        } else {
            ans = power(x, n);
        }
        return ans;
    }
}
