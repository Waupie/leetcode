/**
 * Author:      Maximilian Holm
 * Date:        21/04/2025
 * Description: This implementation scans the input string from the end, skips any trailing 
 *              spaces, and then counts characters until the next space or the start of the
 *              string is reached.
 *
 */


class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        while (end >= 0 && s.charAt(end) == ' ') { end--; }

        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') { start--; }
c
        return end - start;
    }
}
