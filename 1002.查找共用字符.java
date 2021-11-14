/*
 * @lc app=leetcode.cn id=1002 lang=java
 *
 * [1002] 查找共用字符
 */

// @lc code=start
class Solution {
    public List<String> commonChars(String[] words) {
        // Solution from Nick White
        List<String> commonChar = new ArrayList<String>();
        int [] minFrequencies = new int[26];

        Arrays.fill(minFrequencies, Integer.MAX_VALUE);

        for (String currentStr : words) {

            int[] charFrequencies = new int[26];

            for (char c : currentStr.toCharArray()) {
                charFrequencies[c - 'a']++;
            }

            for (int i = 0 ; i < 26 ; i++) {
                minFrequencies[i] = Math.min(minFrequencies[i], charFrequencies[i]);
            }
        }

        for (int i = 0 ; i < 26 ; i++) {
            while (minFrequencies[i] > 0) {
                commonChar.add("" + (char)(i + 'a'));
                minFrequencies--;
            }
        }
        return commonChar;
    }
}
// @lc code=end

