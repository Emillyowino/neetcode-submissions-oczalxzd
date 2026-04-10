class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
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
        return div;    
    }
}
