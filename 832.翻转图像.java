/*
 * @lc app=leetcode.cn id=832 lang=java
 *
 * [832] 翻转图像
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // mine
        // flipHorizontallyImage(image);
        // reversalImage(image);
        // return image;

        // Solution from Nick White
        // for images are huge ????
        for (int i = 0 ; i < image.length ; i++) {
            int low = 0;
            int high = image[i].length - 1;

            while (low <= high) {
                if (image[i][low] == image[i][high]) {
                    image[i][low] = 1 - image[i][low];
                    image[i][high] = image[i][low];
                }
                low++;
                high--;
            }
        }
        return image;
    }

    // public void reversalImage(int[][] image) {
    //     for (int i = 0 ; i < image.length ; i++) {
    //         for (int j = 0 ; j < image[i].length ; j++) {
    //             image[i][j] = image[i][j] ^ 1;
    //         }
    //     }
    // }
    // public void flipHorizontallyImage(int[][] image) {
    //     for (int i = 0 ; i < image.length ; i++) {
    //         int n = image[i].length;
    //         for (int j = 0 ; j < n / 2 ; j++) {
    //             // swap
    //             int temp = image[i][j];
    //             image[i][j] = image[i][n - 1 - j];
    //             image[i][n - 1 - j] = temp;
    //         }
    //     }
    // }
}
// @lc code=end

