class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        int top = 0;
        int bottom = numRows - 1;

        // Binary search to find the row where the target might exist
        while (top <= bottom) {
            int mid = (top + bottom) / 2; // Calculate mid correctly
            if (target > matrix[mid][numColumns - 1]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                // Target is within this row
                break;
            }
        }

        // Check if we exited the loop without finding a valid row
        if (!(top <= bottom)) {
            return false;
        }

        // Determine the row where the target might exist
        int row = (top + bottom) / 2;

        // Binary search within the identified row
        int left = 0;
        int right = numColumns - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target > matrix[row][middle]) {
                left = middle + 1;
            } else if (target < matrix[row][middle]) {
                right = middle - 1;
            } else {
                return true; // Target found
            }
        }

        return false; // Target not found
    }
}
