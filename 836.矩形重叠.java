/*
 * @lc app=leetcode.cn id=836 lang=java
 *
 * [836] 矩形重叠
 */

// @lc code=start
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // mine
        // boolean left = false;
        // boolean right = false;
        // boolean top = false;
        // boolean bottom = false;
        // if (rec2[2] <= rec1[0]) left = true;
        // if (rec2[0] >= rec1[2]) right = true;
        // if (rec2[1] >= rec1[3]) top = true;
        // if (rec2[3] <= rec1[1]) bottom = true;

        // return !(left || right || top || bottom);

        // Solution from Nick White
        // (x1, y2)  -  (x2, y2)
        //    |            |
        // (x1, y1)  -  (x2, y1)
        return rec1[0] < rec2[2] && 
            rec1[1] < rec2[3] && 
            rec1[2] > rec2[0] && 
            rec1[3] > rec2[1];
    }
}
// @lc code=end

