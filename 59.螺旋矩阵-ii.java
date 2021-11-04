/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        // solution from Nick White
        int[][] res = new int[n][n];
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        int counter = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                res[rowBegin][i] = counter++;
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                res[i][colEnd] = counter++;
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    res[rowEnd][i] = counter++;
                }
            }
            rowEnd--;
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res[i][colBegin] = counter++;
                }
            }
            colBegin++;
        }
        
        return res;
    }
}
// @lc code=end

