/**
 * Author:      Maximilian Holm
 * Date:        10/04/2025
 * Description: This method checks whether a given string 's' follows a specific pattern
 *              defined by the string 'pattern'. It ensures a bijective (one-to-one and 
 *              onto) mapping between characters in 'pattern' and non-empty words in 's'.
 *              Each character in the pattern must map to exactly one unique word, and
 *              each word must map back to exactly one character. The method returns true 
 *              if such a bijection exists, otherwise false.
 */


class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> firstPatternMap = new HashMap<>();
        Map<String, Character> secondPatternMap = new HashMap<>();
        String[] words = s.split(" ");
        
        // Pattern and words length mismatch
        if (words.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (firstPatternMap.containsKey(c)) {
                if (!firstPatternMap.get(c).equals(word)) return false;
            } else {
                firstPatternMap.put(c, word);
            }

            if (secondPatternMap.containsKey(word)) {
                if (secondPatternMap.get(word) != c) return false;
            } else {
                secondPatternMap.put(word, c);
            }
        }

        return true;
    }
}
