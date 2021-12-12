/*
 * @lc app=leetcode.cn id=807 lang=java
 *
 * [807] 保持城市天际线
 */

// @lc code=start
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // mine
        // if (grid.length == 0) return 0;
        // int rows = grid.length;
        // int cols = grid[0].length;
        
        // int[] skyLineRows = new int[rows];
        // int[] skyLineCols = new int[cols];

        // for (int i = 0 ; i < rows ; i++) {
        //     int max = 0;
        //     for (int j = 0 ; j < cols ; j++) {
        //         if (grid[i][j] > max) max = grid[i][j];
        //     }
        //     skyLineRows[i] = max;
        // }

        // for (int j = 0 ; j < cols ; j++) {
        //     int max = 0;
        //     for (int i = 0 ; i < rows ; i++) {
        //         if (grid[i][j] > max) max = grid[i][j];
        //     }
        //     skyLineCols[j] = max;
        // }

        // int result = 0;
        // for (int i = 0 ; i < rows ; i++) {
        //     for (int j = 0 ; j < cols ; j++) {
        //         result += Math.min(skyLineRows[i], skyLineCols[j]) - grid[i][j];
        //     }
        // }
        // return result;

        // Solution From Nick White
        int result = 0;
        int n = grid.length;

        int[] maxRowVals = new int[n];
        int[] maxColVals = new int[n];

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                maxRowVals[i] = Math.max(maxRowVals[i], grid[i][j]);
                maxColVals[j] = Math.max(maxColVals[j], grid[i][j]);
            }
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                result += Math.min(maxColVals[j], maxRowVals[i]) - grid[i][j];
            }
        }
        return result;

    }
}
// @lc code=end

