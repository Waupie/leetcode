/**
 * Author:      Maximilian Holm
 * Date:        10/04/2025
 * Description: This method checks whether two strings 's' and 't' are anagrams of each other.
 *              Two strings are anagrams if they contain the same characters with the same frequencies,
 *              but possibly in a different order. The method creates two hash maps to count character
 *              frequencies in each string, and then compares the two maps using .equals(). If the
 *              frequency maps are identical, the strings are anagrams and the method returns true.
 */


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // s key and value
            char sKey = s.charAt(i);
            int sValue = sMap.getOrDefault(sKey, 0);
            sMap.put(sKey, sValue + 1);

            // t key and value
            char tKey = t.charAt(i);
            int tValue = tMap.getOrDefault(tKey, 0);
            tMap.put(tKey, tValue + 1);
        }
        return sMap.equals(tMap);
    }
}