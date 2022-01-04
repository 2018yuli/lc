/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        // mine
        // int dollars5 = 0;
        // int dollars10 = 0;
        // for (int bill : bills) {
        //     if (bill == 5) {
        //         dollars5++;
        //     } else if (bill == 10) {
        //         if (dollars5 > 0) dollars5--;
        //         else return false;
        //         dollars10++;
        //     } else if (bill == 20) {
        //         if (dollars10 > 0 && dollars5 > 0) {
        //             dollars10--;
        //             dollars5--;
        //         } else if (dollars5 >= 3){
        //             dollars5 -= 3;
        //         } else {
        //             return false;
        //         }
        //     }
        // }
        // return true;

        // Solution from Nick White
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                ten++;
                five--;
            } else if (ten > 0) {
                ten--;
                five--;
            } else {
                five -= 3;
            }
            if (five < 0) return false;
        }
        return true;
    }
}
// @lc code=end

