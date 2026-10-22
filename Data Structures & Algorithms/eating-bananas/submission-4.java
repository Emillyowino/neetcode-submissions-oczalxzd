class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int n = piles.length;
        int hi = max;
        int lo = 1; // cant have rate of 0 or lower
        // lets binary search for the rate - boundary binary search to find what is the first point where it works or doesnt
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // rate
            // calculating total time to consume a pile
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += Math.ceilDiv(piles[i], mid); // cant have rate of 0 to avoid div by 0
            }

            // updating lo and hi
            if (total > h) {
                lo = mid + 1; // increase rate
            } else if (total <= h) { // we need to reduce further to see if we can find a smaller rate - what if we cannot? do we take lo or hi?
                hi = mid - 1;
            } /* else { // equal that's the lowest possible
                return mid;
            } */
        }
        return lo;

        























       /*  Arrays.sort(piles);





        int n = piles.length;
        if (h == n) {
            return piles[n - 1];
        }
        int div = 0;
        int ans = 0;
        int rem = 0;
        long sum = Long.MAX_VALUE;

        while (sum > h) {
            sum = 0;
            div++;
            for (int i = 0; i < n; i++) {
                int x = piles[i];
                ans = x / div;
                rem = x % div;
                if (rem != 0) {
                    ans++;
                }
                sum += ans;
            }
        }   
        return div;     */
    }
}
