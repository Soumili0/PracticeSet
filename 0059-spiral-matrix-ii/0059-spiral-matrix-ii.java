class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;
        int target = n * n;

        while (num <= target) {
            // 1. Traverse left to right along the top boundary
            for (int col = left; col <= right && num <= target; col++) {
                matrix[top][col] = num++;
            }
            top++;

            // 2. Traverse top to bottom along the right boundary
            for (int row = top; row <= bottom && num <= target; row++) {
                matrix[row][right] = num++;
            }
            right--;

            // 3. Traverse right to left along the bottom boundary
            for (int col = right; col >= left && num <= target; col--) {
                matrix[bottom][col] = num++;
            }
            bottom--;

            // 4. Traverse bottom to top along the left boundary
            for (int row = bottom; row >= top && num <= target; row--) {
                matrix[row][left] = num++;
            }
            left++;
        }

        return matrix;
    }
}