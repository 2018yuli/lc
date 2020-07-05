// import java.util.ArrayList;
// import java.util.List;

/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        // // every set number = quotient*pow+remainder = pow + (quotient - 1) * quotient + remainder
        // List<Integer> remainders = new ArrayList<Integer>();
        // 构造Z+
        // int quotient = Math.abs(x);
        // 逻辑一：整数的数位逐个拆分
        //      递推公式<=>r1+10*r2+100*r3+...=r1+10(r2+10*r3+...)
        // while (quotient > 0) {
        //     remainders.add(quotient % 10);
        //     quotient = quotient / 10;
        // }
        // 逻辑二：多个数构成一个整数
        // int result = 0;
        // int pow = 0;
        // for (int i = remainders.size() - 1 ; i > -1 ; i--) {
        //     result += remainders.get(i) * Math.pow(10, pow++);
        // }
        // 处理边界值
        // if (result == Integer.MAX_VALUE || result < 0)
        //     result = 0;
        // 反转Z+
        // if (x < 0)
        //     result = - result;
        // return result;

        //////////////////////////
        // 官方解题
        long temp = 0;
       
        while(x != 0){
            int pop = x % 10;
            temp = temp * 10 + pop;
            
            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)temp;
    }
}
// @lc code=end

