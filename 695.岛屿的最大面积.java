/*
 * @lc app=leetcode.cn id=695 lang=java
 *
 * [695] 岛屿的最大面积
 */

// @lc code=start
class Solution {
    // public int maxAreaOfIsland(int[][] grid) {
    //     // mine
    //     int max = 0;
    //     for (int i = 0 ; i < grid.length; i++) {
    //         for (int j = 0; j < grid[i].length; j++) {
    //             if (grid[i][j] == 1) {
    //                 int count = callRfs(grid, i, j);
    //                 if (count > max)
    //                     max = count;
    //             }
    //         }
    //     }
    //     return max;
    // }

    // public int callRfs(int[][] grid, int i, int j) {
    //     if (i < 0 || i == grid.length 
    //         || j < 0 || j == grid[i].length
    //         || grid[i][j] == 0) {
    //         return 0;
    //     }
    //     int count = 1;
    //     grid[i][j] = 0;
    //     count += callRfs(grid, i - 1, j);    // up
    //     count += callRfs(grid, i + 1, j);    // down
    //     count += callRfs(grid, i, j - 1);    // left
    //     count += callRfs(grid, i, j + 1);    // right
    //     return count;
    // }

    // Solution from Nick White
    boolean seen[][];
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        int rows = grid.length;
        int cols = grid[0].length;
        seen = new boolean[rows][cols];

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                maxArea = Math.max(maxArea, area(i, j, grid));
            }
        }
        return maxArea;
    }

    /**
     *
     * @param row
     * @param col
     * @param grid
     * @return 
     */
    public int area(int row, int col, int grid[][]) {
        if (row < 0 || row >= grid.length || col < 0 ||
            col >= grid[row].length || grid[row][col] == 0 ||
            seen[row][col]) {
            return 0;
        }

        seen[row][col] = true;
        return (1 +
            area(row + 1, col, grid) +
            area(row - 1, col, grid) +
            area(row, col + 1, grid) +
            area(row, col - 1, grid));

    }
}
// @lc code=end

