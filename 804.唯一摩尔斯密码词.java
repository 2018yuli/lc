/*
 * @lc app=leetcode.cn id=804 lang=java
 *
 * [804] 唯一摩尔斯密码词
 */

// @lc code=start
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueCodes = new HashSet<String>();
        String[] MORSE = new String[]{
            ".-","-...","-.-.",
            "-..",".","..-.",
            "--.","....","..",
            ".---","-.-",".-..",
            "--","-.","---",
            ".--.","--.-",".-.",
            "...","-","..-",
            "...-",".--","-..-",
            "-.--","--.."
        };

        for (String word : words) {
            StringBuilder transformation = new StringBuilder();

            for (char c : word.toCharArray()) {
                transformation.append(MORSE[c - 'a']);
            }
            
            uniqueCodes.add(transformation.toString());
        }

        return uniqueCodes.size();
    }
}
// @lc code=end

