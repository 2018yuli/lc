/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        // mine
        // List<String> result = new ArrayList<String>();
        // int threeBase = 0;
        // int fiveBase = 0;
        // for (int i = 0 ; i < n ; i++) {
        //     if (threeBase == 2 && fiveBase == 4) {
        //         result.add("FizzBuzz");
        //         threeBase = 0;
        //         fiveBase = 0;
        //     }else if (threeBase == 2) {
        //         result.add("Fizz");
        //         threeBase = 0;
        //         fiveBase++;
        //     }else if (fiveBase == 4) {
        //         result.add("Buzz");
        //         threeBase++;
        //         fiveBase = 0;
        //     }else {
        //         result.add((i + 1) + "");
        //         threeBase++;
        //         fiveBase++;
        //     }
        // }
        // return result;

        // Solution from Nick White
        List<String> outPutArr = new ArrayList();
        for (int i = 1, fizz = 0, buzz = 0 ; i <= n ; i++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                outPutArr.add("FizzBuzz");
            } else if (fizz == 3) {
                fizz = 0;
                outPutArr.add("Fizz");
            } else if (buzz == 5) {
                buzz = 0;
                outPutArr.add("Buzz");
            } else {
                outPutArr.add(i + "");
            }
        }
        return outPutArr;
    }
}
// @lc code=end

