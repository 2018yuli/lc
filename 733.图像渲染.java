/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // mine
        // boolean[][] visited = new boolean[image.length][image[0].length];
        // fill(image, visited, sr, sc, image[sr][sc], newColor);
        // return image;

        // Solution from Nick White
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0
            || sc < 0
            || sr >= image.length
            || sc >= image[0].length
            || image[sr][sc] != color) {
            return;
        }
        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, color, newColor);
        fill(image, sr + 1, sc, color, newColor);
        fill(image, sr, sc - 1, color, newColor);
        fill(image, sr, sc + 1, color, newColor);
    }

    // public void fill(int[][] image, boolean[][] visited, int sr, int sc, int oldColor, int newColor) {
    //     if (!visited[sr][sc] && image[sr][sc] == oldColor) {
    //         image[sr][sc] = newColor;
    //         visited[sr][sc] = true;

    //         if (sr + 1 < image.length)
    //             fill(image, visited, sr + 1, sc, oldColor, newColor);
    //         if (sr - 1 >= 0)
    //             fill(image, visited, sr - 1, sc, oldColor, newColor);
    //         if (sc + 1 < image[0].length)
    //             fill(image, visited, sr, sc + 1, oldColor, newColor);
    //         if (sc - 1 >= 0)
    //             fill(image, visited, sr, sc - 1, oldColor, newColor);
    //     }
    // }
}
// @lc code=end

