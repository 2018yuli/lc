/*
 * @lc app=leetcode.cn id=824 lang=java
 *
 * [824] 山羊拉丁文
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String sentence) {
        // mine（Snape pronunciation）
        // String[] words = sentence.split(" ");
        // int index = 1;
        // StringBuilder result = new StringBuilder();
        // for (int i = 0 ; i < words.length ; i++) {
        //     char startLetter = words[i].charAt(0);
        //     if (startLetter == 'a' || startLetter == 'e' ||
        //         startLetter == 'i' || startLetter == 'o' ||
        //         startLetter == 'u' || startLetter == 'A' || 
        //         startLetter == 'E' || startLetter == 'I' || 
        //         startLetter == 'O' || startLetter == 'U') {
        //             result.append(words[i]);
        //     } else {
        //         result.append(words[i].substring(1));
        //         result.append(startLetter);
        //     }
        //     result.append("ma");
        //     for (int j = 0 ; j <= i ; j++) {
        //         result.append("a");
        //     }
        //     if (i != words.length - 1) {
        //         result.append(" ");
        //     }
        // }
        // return result.toString();

        // Solution from Nick White
        HashSet<Character> vowels = new HashSet<Character>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        String result = "";
        int index = 1;
        for (String word : sentence.split("\\s")) {
            
            if (index > 1) result += " ";

            char firstLetter = word.charAt(0);
            if (vowels.contains(firstLetter)) {
                result += word + "ma";
            } else {
                result += word.substring(1) + firstLetter + "ma";
            }

            for (int i = 0 ; i < index ; i++) {
                result += "a";
            }

            index += 1;
        }
        return result;
    }
}
// @lc code=end

