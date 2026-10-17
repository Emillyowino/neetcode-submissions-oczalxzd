class Solution {
    public int maxArea(int[] heights) {
/* 
        int height = 0;
        int width = 0;
        int area = 0;
        int maxAr = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                height = Math.min(heights[i], heights[j]);
                width = j - i;
                area = height * width; 
                maxAr = Math.max(area, maxAr);
            }
        }
        return maxAr;
      */   

    int n = heights.length;
    int max = 0;

    int i = 0, j = n - 1, height = 0, width = 0, area = 0;

    while (i < j) {
        height = Math.min(heights[i], heights[j]);
        width = j - i;
        area = height * width;
        max = Math.max(area, max);

        if (heights[i] <= heights[j]) {
            i+=1;
        } else {
            j-=1;
        }
    }
    return max;
    }
}
