/*
 * @lc app=leetcode.cn id=929 lang=java
 *
 * [929] 独特的电子邮件地址
 */

// @lc code=start
class Solution {
    public int numUniqueEmails(String[] emails) {
        // Solution from Nick White
        Set<String> uniqueEmails = new HashSet<String>();
        for (String email : emails) {
            int splitPosition = email.indexOf("@");
            String localName = email.substring(0, splitPosition);
            String domainName = email.substring(splitPosition);

            if (localName.contains("+")) {
                int plusPosition = localName.indexOf("+");
                localName = localName.substring(0, plusPosition);
            }
            localName = localName.replaceAll("\\.", "");
            String newName = localName + domainName;
            uniqueEmails.add(newName);
        }
        return uniqueEmails.size();
    }
}
// @lc code=end

