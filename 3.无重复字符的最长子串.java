import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    // 求子集，无重复元素
    // 重复使用substring 极为耗费内存
    public int lengthOfLongestSubstring(String s) {

        // int max = 0;
        // int start = 0;
        // int end = 0;
        // char[] charArr = s.toCharArray();
        // String language = "";
        // for (; end < charArr.length; end++) {
        //     language = s.substring(start, end);
        //     if (language.contains(charArr[end] + "")){
        //         if (max < language.length())
        //             max = language.length();
        //         start = start + language.indexOf(charArr[end]) + 1;
        //     }
        //     // 特殊处理尾数
        //     else if (end == charArr.length - 1) {
        //         if (max <= language.length()) 
        // 		 max = language.length() + 1;
        //     }
        // }
        // return max;

        // 官方解题
        // Set<Character> set = new HashSet<Character>();
        // int n = s.length();
        // int i = 0;
        // int j = 0;
        // int len = 0;
        // // 1、双指针定义“串”，一种特殊的集合
        // // 2、以HashSet代替字符串操作
        // // 3、以Math.max代替if语句判断，简化算法
        // while (i < n && j < n) {
        //     // 移动首指针
        //     if (set.contains(s.charAt(j))) {
        //         set.remove(s.charAt(i++));
        //     }
        //     // 移动尾指针
        //     else{
        //         set.add(s.charAt(j++));
        //         len = Math.max(len, j - i);
        //     }
        // }
        // return len;

        // 将“串”理解为语言language,提高算法扩展性，优化算法
        int max = 0;
        char[] charArr = s.toCharArray();
        List<Character> language = new ArrayList<Character>();
        // 移动尾指针
        for (int j = 0; j < charArr.length; j++) {
            int index = language.indexOf(charArr[j]);
            if (index != -1){
                max = Math.max(max, language.size());
                // 移动头指针
                for (int i = 0; i <= index; i++) {
                    language.remove(0);
                }
            }
            language.add(charArr[j]);
            // 处理尾数
            if (j == charArr.length - 1) {
                max = Math.max(max, language.size());
            }
        }
        return max;
    }
}
// @lc code=end

