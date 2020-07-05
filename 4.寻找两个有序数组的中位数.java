/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个有序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // double result = 0;
        // int total = nums1.length + nums2.length;
        // // 中值下标
        // boolean even = total % 2 == 0;
        // int m = even ? total / 2 : (total + 1) / 2;
        // int i = 0;
        // int j = 0;
        // double first = 0;
        // double second = 0;
        // // 归并
        // // 
        // while (i + j <= m) {
        //     if (i < nums1.length && (j == nums2.length || nums1[i] < nums2[j])){
        //         if (i + j == m - 1) {
        //             first = nums1[i];
        //         }
        //         if (i + j == m) {
        //             second = nums1[i];
        //         }
        //         i++;
        //     }
        //     else if (j < nums2.length){
        //         if (i + j == m - 1) {
        //             first = nums2[j];
        //         }
        //         if (i + j == m) {
        //             second = nums2[j];
        //         }
        //         j++;
        //     }
        //     else {
        //         break;
        //     }
            
        // }
        // if (even){
        //     result = (first + second) / 2;
        // }
        // else{
        //     result = first;
        // }
        // return result;

        // ////////////////////////////////////////
        // 官方解题
        // 假设 m>n
        // 构造二维比对步骤 j=(m+n+1)/2−i
        // A[0], A[1], ..., A[i-1] | A[i], A[i+1], ..., A[m-1]
        // B[0], B[1], ..., B[j-1] | B[j], B[j+1], ..., B[n-1]
        //
        // len(left_part)=len(right_part)
        // max⁡(left_part)≤min⁡(right_part)
        // median= (max(left_part)+min(right_part))/2
        //
        // 在 [0，m]中搜索并找到目标对象 i，以使：
        // B[j−1]≤A[i] 且 A[i−1]≤B[j], 
        // 其中 
        // 然后使用二叉树搜索查找i 分治思想
        // 
        // 发现 i 和 j 之间的关系 j=(m+n+1)/2−i
        // 并构造 基于i的递推步骤
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) { // to ensure m<=n
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && nums2[j-1] > nums1[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && nums1[i-1] > nums2[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = nums2[j-1]; }
                else if (j == 0) { maxLeft = nums1[i-1]; }
                else { maxLeft = Math.max(nums1[i-1], nums2[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = nums2[j]; }
                else if (j == n) { minRight = nums1[i]; }
                else { minRight = Math.min(nums2[j], nums1[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
// @lc code=end

