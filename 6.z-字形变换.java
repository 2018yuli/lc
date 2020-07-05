/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        // 个人解题，分组法，
        // 分组之后的01221为一组，
        // 分组后012|21不对称，导致解题失败
        // 
        // if (numRows == 1)
        //     return s;
        // int length = s.length();
        // char[] result = new char[length];
        // int resultIndex = 0;
        // int step = numRows > length ? length - 1 : numRows - 1;
        // // 最小占用内存空间
        // for (int i = 0 ; i < numRows ; i++){
        //     // Z字行之间波动
        // 	int row = -1;
        //     for (int index = 0 ; index < length ; index++){
        // 		row += (int)(Math.pow(-1, step == 0 ? 0 : (index - 1)/step));
        //         if (row == i){
        //             result[resultIndex++] = s.charAt(index);
        //         }
        //     }
        // }
        // return String.valueOf(result);

        //////////////////////////////////////////
        // 官方解题
        // 递推公式 k(2n-2) + i, (k+1)(2n-2) - i

        //////////////////////////////////////////
        // 官方解题
        // 巧妙的利用整数性质，使用上界和下界产生摆动
        if(numRows == 1)
            return s;
        
        int len = Math.min(s.length(), numRows);
        String []rows = new String[len];
        for(int i = 0; i< len; i++) rows[i] = "";
        int loc = 0;
        boolean down = false;

        for(int i=0;i<s.length();i++) {
            rows[loc] += s.substring(i,i+1);
            if(loc == 0 || loc == numRows - 1)
                down = !down;
            loc += down ? 1 : -1;
        }
        
        String ans = "";
        for(String row : rows) {
            ans += row;
        }
        return ans;
    }
}
// @lc code=end

