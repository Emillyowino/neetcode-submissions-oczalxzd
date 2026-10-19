class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // transpose
        for (int row = 0; row < n; row++) { // traversing row-wise
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row] ;
                matrix[col][row] = temp;
            }
        }

        // reversing rows
        for (int row = 0; row < n; row++) { // trevesrsing rows-wise
            for (int col = 0; col < n / 2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][n - col - 1];
                matrix[row][n - col - 1] = temp;
            }
        }
    }
}
