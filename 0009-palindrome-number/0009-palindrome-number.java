class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindromes
        // Numbers ending with 0 are not palindromes (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {

            // Extract last digit
            int digit = x % 10;

            // Build reversed number
            reversed = reversed * 10 + digit;

            // Remove last digit
            x = x / 10;
        }

        // Check for even and odd number of digits
        return x == reversed || x == reversed / 10;
    }
}
