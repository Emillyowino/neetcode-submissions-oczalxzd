class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        // int minDimension = 0;
        if (n == 2) {
            return Math.min(heights[0], heights[1]);
        }

        int max = 0;
        int water = 0;
        int currentHeight = 0;
        int width = 0;
        for (int i = 1; i < n; i++) {
            int height = heights[i];
            for (int j = 0; j <= i - 1; j++) {
                width = i - j;
                currentHeight = heights[j];
                water = width * Math.min(height, currentHeight);
                max = Math.max(max, water);
            }
        }
        return max;

/*         int max = 0;
        int water = 0;
        for (int i = 0, j = n - 1; i < n; i++) {
            int width = j - i - 1;
            int height = Math.min(heights[i], heights[j]);
            water = width * height;
            max = Math.max(max, water);
        } */

    }
}
