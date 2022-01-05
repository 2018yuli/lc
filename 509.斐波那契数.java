/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        // mine
        // if (n == 0) return n;
        // int a = 1;
        // int b = 1;
        // int temp;
        // for(int i = 2; i < n; i++) {
        //     temp = a;
        //     a = b;
        //     b += temp;
        // }
        // return b;

        // Solution from Nick White
        // Sequence
        // if (n == 0) return 0;
        // if (n == 1) return 1;
        // return fib(n - 1) + fib(n - 2);

        // 
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0;
        int b = 1;
        int sum = a + b;

        while (n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }
}
// @lc code=end

