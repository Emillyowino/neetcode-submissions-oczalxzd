class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - prices[buy];
            max = Math.max(profit, max);
            if (prices[i] < prices[buy]) {
                buy = i;
            }
        }
        return max;


        /* int max = 0;
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i];
                max = Math.max(max, profit);
            }
        }
        return max;

        // 2 pointers */
        































       /*  int max = 0;
        int diff = 0;
        for (int i = 0, j = prices.length; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                diff = prices[k] - prices[i];
                max = Math.max(max, diff);
            }
        }
        return max; */
    }
}
