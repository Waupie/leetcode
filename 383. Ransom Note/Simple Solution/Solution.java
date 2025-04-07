/**
 * Author:      Maximilian Holm
 * Date:        07/04/2025
 * Description: This method checks if the given ransomNote can be constructed 
 *              using characters from the given magazine. It does so by 
 *              verifying if the magazine contains the ransomNote as a whole. 
 *              The method returns true if it can be constructed, otherwise false.
 */


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        return magazine.contains(ransomNote);
    }
}