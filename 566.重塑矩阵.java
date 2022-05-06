/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // mine
        // int rows = mat.length;
        // int cols = mat[0].length;

        // if (rows * cols != r * c) return mat;

        // int[][] outputArr = new int[r][c];
        // int index = 0;
        // for (int i = 0 ; i < outputArr.length ; i++) {
        //     for (int j = 0 ; j < outputArr[i].length ; j++) {
        //         outputArr[i][j] = mat[index / cols][index % cols];
        //         index++;
        //     }
        // }
        // return outputArr;

        // Solution from Nick White
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) return mat;

        int[][] outputArr = new int[r][c];
        int rowNums = 0;
        int colNums = 0;

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                outputArr[rowNums][colNums] = mat[i][j];
                colNums++;

                if (colNums == c) {
                    colNums = 0;
                    rowNums++;
                }
            }
        }
        return outputArr;
    }
}
// @lc code=end

