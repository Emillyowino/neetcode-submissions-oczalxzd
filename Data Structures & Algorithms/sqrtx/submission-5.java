class Solution {
    public int mySqrt(int x) {
        int high = x / 2;
        int mid = 0;
        int low = 1;
        long square = 0;

        if (x == 1 || x == 0) {
            return x;
        }

        while (low <= high) {
            mid = low + (high - low) / 2;
            square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}