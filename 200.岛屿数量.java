/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        // Graph path problem
        
        // Solution from Nick White
        int count = 0;
        for (int i = 0 ; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    callRfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void callRfs(char[][] grid, int i, int j) {
        if (i < 0 || i == grid.length 
            || j < 0 || j == grid[i].length
            || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        callRfs(grid, i - 1, j);    // up
        callRfs(grid, i + 1, j);    // down
        callRfs(grid, i, j - 1);    // left
        callRfs(grid, i, j + 1);    // right
    }
}
// @lc code=end

