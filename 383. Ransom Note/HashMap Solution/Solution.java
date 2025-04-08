/**
 * Author:      Maximilian Holm
 * Date:        08/04/2025
 * Description: This method checks if the given ransomNote can be constructed 
 *              using characters from the given magazine. It does so by 
 *              counting the occurrences of each character in the magazine 
 *              and ensuring that the ransomNote does not require more of any 
 *              character than what the magazine provides. Each character in 
 *              the magazine can only be used once. The method returns true if 
 *              the ransomNote can be constructed, otherwise false.
 */


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        // increment each keys value to 1
        for (char c : magazine.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        // decrement each keys value to 0 when added, if the value is equal to 0
        // then return false, cause it already exists..
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}