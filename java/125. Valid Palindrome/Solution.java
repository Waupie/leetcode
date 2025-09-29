/**
 * Author:      Maximilian Holm
 * Date:        2025-04-16
 * Description: This method checks whether a given string is a palindrome,
 *              ignoring non-alphanumeric characters and case differences.
 */


class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder returnString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            returnString.append(s.charAt(i));
        }
        return s.equals(returnString.toString());
    }
}