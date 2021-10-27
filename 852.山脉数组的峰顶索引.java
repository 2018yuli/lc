/*
 * @lc app=leetcode.cn id=852 lang=java
 *
 * [852] 山脉数组的峰顶索引
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      // solution from Nick White
      int left = 0;
      int right = arr.length - 1;
      while (left < right) {
          int middlePoint = left + (right - left) /2;
          if (arr[middlePoint] < arr[middlePoint + 1]) {
              left = middlePoint + 1;
          } else {
              right = middlePoint;
          }
      }
      return left;
    }
}
// @lc code=end

