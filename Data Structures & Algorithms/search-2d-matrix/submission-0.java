class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (matrix[m - 1][n - 1] < target) {
            return false;
        }
        int high = 0;
        int low = 0;
        int mid = 0;

        int x = 0;

        for (int i = 0; i < m; i++) {
            if (matrix[i][n -1] == target) {
                return true;
            } else if (matrix[i][n -1] > target) {
                x = i;
                break;
            }
        }

        high = n - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (matrix[x][mid] == target) {
                return true;
            } else if (matrix[x][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
