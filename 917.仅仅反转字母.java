/*
 * @lc app=leetcode.cn id=917 lang=java
 *
 * [917] 仅仅反转字母
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String s) {
        // Solution
        // char[] sArr = s.toCharArray();
        // int i = 0;
        // int j = sArr.length - 1;
        // //
        // String rstStr = "";
        // while (i < j) {
        //     while (!Character.isLetter(sArr[i]) && i < j) {
        //         i++;
        //     }
        //     while (!Character.isLetter(sArr[j]) && i < j) {
        //         j--;
        //     }
        //     if (i < j) {
        //         char temp = sArr[i];
        //         sArr[i] = sArr[j];
        //         sArr[j] = temp;
        //         i++;
        //         j--;
        //     }
        // }
        // return new String(sArr);

        // Solution from Nick White
        Stack<Character> letters = new Stack<Character>();
        for (int i = 0 ; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letters.push(s.charAt(i));
            }
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = 0 ; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                reverseString.append(letters.pop());
            }else {
                reverseString.append(s.charAt(i));
            }
        }
        return reverseString.toString();
    }
}
// @lc code=end

