/**
 * Author:      Maximilian Holm
 * Date:        30/03/2025
 * Description: This class contains a method to validate whether a given string
 *              containing parentheses, brackets, or braces is valid. A string 
 *              is valid if the brackets are closed in the correct order.
 */


 class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Valid pair for '()'
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // Valid pair for '{}'
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // Valid pair for '[]'
            } else {
                return false; // Invalid character or unmatched closing bracket
            }
        }
        
        return stack.isEmpty(); // Return true if no unmatched opening brackets remain
    }
}