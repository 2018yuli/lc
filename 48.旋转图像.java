/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        // mine
        // // route + swap content
        // // 1. 行列转换
        // // 2. 左右翻转
        // int n = matrix.length;
        // // 1    2   3           1   4   7
        // // 4    5   6   -->     2   5   8
        // // 7    8   9           3   6   9
        // for (int i = 0 ; i < n ; i++) {
        //     for (int j = i + 1 ; j < n ; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }
        // //  1   4   7           7   4   1
        // //  2   5   8   -->     8   5   2
        // //  3   6   9           9   6   3
        // int halfN = n / 2;
        // for (int i = 0 ; i < n ; i++) {
        //     for (int j = 0 ; j < halfN ; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[i][n - 1 - j];
        //         matrix[i][n - 1 - j] = temp;
        //     }
        // }

        // Solution from Nick White
        int n = matrix.length;
        for (int i = 0 ; i < n; i++) {
            for (int j = i ; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < (n / 2) ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

    }
}
// @lc code=end

