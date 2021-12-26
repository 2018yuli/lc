/*
 * @lc app=leetcode.cn id=821 lang=java
 *
 * [821] 字符的最短距离
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        // mine
        // int len = s.length();
        // int[] result = new int[len];
        // Stack<Integer> stack = new Stack<Integer>();
        // for (int i = 0 ; i < len ; i++) {
        //     char ci = s.charAt(i);
        //     if (ci == c) {
        //         int num = 0;
        //         while (!stack.isEmpty()) {
        //             num++;
        //             result[stack.pop()] = num;
        //         }
        //     } else {
        //         stack.push(i);
        //     }
        // }
        // stack.clear();
        // for (int i = len - 1 ; i >= 0 ; i--) {
        //     char ci = s.charAt(i);
        //     if (ci == c) {
        //         int num = 0;
        //         while (!stack.isEmpty()) {
        //             num++;
        //             int index = stack.pop();
        //             if (result[index] == 0 || num < result[index]) {
        //                 result[index] = num;
        //             }
        //         }
        //     } else {
        //         stack.push(i);
        //     }
        // }
        // return result;

        // Solution from Nick White
        int n = s.length();
        int[] outputArr = new int[n];
        int cPosition = -n;

        for (int i = 0 ; i < n ; i++) {
            if (s.charAt(i) == c) {
                cPosition = i;
            }
            outputArr[i] = i - cPosition;
        }
        for (int i = n - 1 ; i >= 0 ; i--) {
            if (s.charAt(i) == c) {
                cPosition = i;
            }
            outputArr[i] = Math.min(outputArr[i], Math.abs(i - cPosition));
        }
        return outputArr;
    }
}
// @lc code=end

