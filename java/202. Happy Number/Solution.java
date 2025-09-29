/**
 * Author:      Maximilian Holm
 * Date:        11/04/2025
 * Description: This solution determines whether a number `n` is a happy number.
 *              A happy number is a number that eventually reaches 1 when replaced repeatedly
 *              by the sum of the squares of its digits.
 * 
 *              This implementation uses a HashMap to track previously seen numbers.
 *              If the number 1 is reached, the function returns true.
 *              If a loop is detected (number repeats), it returns false.
 */


class Solution {
    public boolean isHappy(int n) {
        int max = Integer.MAX_VALUE; // 2147483647
        int min = 1;
        if (n <= min && n >= max) return false;

        Map<Integer, Boolean> seen = new HashMap<>();

        while (n != 1 && !seen.containsKey(n)) {
            seen.put(n, true);
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    public int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}