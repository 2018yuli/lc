/*
 * @lc app=leetcode.cn id=925 lang=java
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // mine
        // int nameIndex = 0;
        // int typedIndex = 0;
        // int nameLen = name.length();
        // int typedLen = typed.length();
        
        // while (nameIndex < nameLen || typedIndex < typedLen) {
        //     char nameChar = nameIndex < nameLen ? name.charAt(nameIndex) : '0';
        //     int nameCount = 1;
        //     while (++nameIndex < nameLen && name.charAt(nameIndex) == nameChar) {
        //         nameCount++;
        //     }

        //     char typedChar = typedIndex < typedLen ? typed.charAt(typedIndex) : '0';
        //     int typedCount = 1;
        //     while (++typedIndex < typedLen && typed.charAt(typedIndex) == typedChar) {
        //         typedCount++;
        //     }

        //     if (nameChar != typedChar || nameCount > typedCount) {
        //         return false;
        //     }
            
        // }
        // return true;

        // Solution from Nick White
        // if (name.length() == typed.length()) return true;
        if (name.length() > typed.length()) return false;

        int i = 0;
        int j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        return i == name.length();
    }
}
// @lc code=end

