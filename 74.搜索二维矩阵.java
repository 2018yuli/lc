/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // binary search
        // if (matrix.length == 0) return false;
        // int rowLow = 0;
        // int rowHigh = matrix.length - 1;
        // int colLow = 0;
        // int colHigh = matrix[0].length - 1;
        // boolean rowChange = false;

        // while (rowLow <= rowHigh && colLow <= colHigh) {
        //     int midRow = (rowLow + rowHigh) / 2;
        //     int midCol = (colLow + colHigh) / 2;
        //     if (target == matrix[midRow][midCol]) {
        //         return true;
        //     }
        //     if (target > matrix[midRow][midCol]) {
        //         if (!rowChange) {
        //             if (rowLow != rowHigh)
        //                 rowLow = midRow + 1;
        //             rowChange = true;
        //         }else {
        //             colLow = midCol + 1;
        //             rowChange = false;
        //         }
        //     }
        //     if (target < matrix[midRow][midCol]) {
        //         if (!rowChange) {
        //             if (rowLow != rowHigh)
        //                 rowHigh = midRow - 1;
        //             rowChange = true;
        //         }else {
        //             colHigh = midCol - 1;
        //             rowChange = false;
        //         }
        //     }
        // }
        // return false;

        // if (matrix.length == 0) return false;
        // int rowLow = 0;
        // int rowHigh = matrix.length - 1;
        // int colLow = 0;
        // int colHigh = matrix[0].length - 1;
        
        // return binarySearch(matrix, rowLow, rowHigh, colLow, colHigh, target);

        // Solution from Nick White
        if (matrix.length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int midPoint = left + (right - left) / 2;
            int midElement = matrix[midPoint / cols][midPoint % cols];
            if (target == midElement) {
                return true;
            }else if (target < midElement) {
                right = midPoint - 1;
            }else if (target > midElement) {
                left = midPoint + 1;
            }
        }
        return false;
    }

    /**
     * @param matrix
     * @param rowLow
     * @param rowHigh
     * @param colLow
     * @param colHigh
     * @param target
     * @return target exist
     */
    // private boolean binarySearch(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh, int target) {
	// 	if (rowLow > rowHigh || colLow > colHigh) {
	// 		return false;
	// 	}
	// 	int midRow = (rowLow + rowHigh) / 2;
    //     int midCol = (colLow + colHigh) / 2;
    //     if (target == matrix[midRow][midCol]) {
    //         return true;
    //     }
    //     if (target > matrix[midRow][midCol]) {
    //     	boolean inRow = binarySearch(matrix, midRow + 1, rowHigh, colLow, colHigh, target);
    //         boolean inCol = binarySearch(matrix, rowLow, rowHigh, midCol + 1, colHigh, target);
    //     	return inRow || inCol;
    //     }
    //     if (target < matrix[midRow][midCol]) {
    //     	boolean inRow = binarySearch(matrix, rowLow, midRow - 1, colLow, colHigh, target);
    //     	boolean inCol = binarySearch(matrix, rowLow, rowHigh, colLow, midCol - 1, target);
    //         return inRow || inCol;
    //     }
    //     return false;
	// }

}
// @lc code=end

