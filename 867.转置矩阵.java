/*
 * @lc app=leetcode.cn id=867 lang=java
 *
 * [867] 转置矩阵
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
        if (matrix.length == 0) return matrix;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] newMatrix = new int[cols][rows];

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}
// @lc code=end

