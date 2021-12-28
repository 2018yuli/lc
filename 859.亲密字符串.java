/*
 * @lc app=leetcode.cn id=859 lang=java
 *
 * [859] 亲密字符串
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String s, String goal) {
        // mine
        // if (s.length() != goal.length()) return false;
        // int len = s.length();
        // if (s.equals(goal)) {
        //     Set<Character> counter = new HashSet<Character>();
        //     for (int i = 0 ; i < len ; i++) {
        //         counter.add(s.charAt(i));
        //         if (counter.size() < i + 1)
        //             return true;
        //     }
        // }

        // char s0 = '0';
        // char s1 = '0';
        // char g0 = '0';
        // char g1 = '0';
        // for (int i = 0 ; i < len ; i++) {
        //     if (s.charAt(i) != goal.charAt(i)) {
        //         if (s0 == '0') {
        //             s0 = s.charAt(i);
        //             g0 = goal.charAt(i);
        //         }else if (s1 == '0') {
        //             s1 = s.charAt(i);
        //             g1 = goal.charAt(i);
        //         }else {
        //             return false;
        //         }
        //     }
        // }
        // if (s0 != '0' && s1 != '0' && s0 == g1 && g0 == s1)
        //     return true;
        // return false;

        // Solution from Nick White
        if (s.length() != goal.length()) return false;
        
        if (s.equals(goal)) {
            HashSet<Character> uniqueChars = new HashSet<Character>();
            for (char c : s.toCharArray()) {
                uniqueChars.add(c);
            }
            if (uniqueChars.size() < s.length()) {
                return true;
            }
            return false;
        }

        List<Integer> diff = new ArrayList<Integer>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }
        if (diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1))
            && s.charAt(diff.get(1)) == goal.charAt(diff.get(0))) {
            return true;
        }
        return false;

    }
}
// @lc code=end

