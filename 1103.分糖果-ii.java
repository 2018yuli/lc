/*
 * @lc app=leetcode.cn id=1103 lang=java
 *
 * [1103] 分糖果 II
 */

// @lc code=start
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        // mine
        // int[] result = new int[num_people];
        // int current = 1;
        // int candiesLeft = candies;
        // for (int i = 0 ; i < candies ; i++) {
        //     int index = i % num_people;
        //     if (candiesLeft > current) {
        //         result[index] += current;
        //     } else {
        //         result[index] += candiesLeft;
        //         break;
        //     }
        //     candiesLeft -= current;
        //     current++;
        // }
        // return result;

        // Solution from Nick White
        int[] outputArr = new int[num_people];
        int i = 0;
        int loops = 0;
        while (candies > 0) {
            if (i == num_people) {
                i = 0;
                loops++;
            }

            int currentCandies = (loops * num_people) + (i + 1);
            if (candies - currentCandies < 0) {
                outputArr[i] += candies;
            } else {
                outputArr[i] += currentCandies;
            }

            i++;
            candies -= currentCandies;
        }
        return outputArr;

    }
}
// @lc code=end

