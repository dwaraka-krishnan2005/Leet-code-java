class pallin {
    public boolean isPalindrome(int x) {
        // 1. Negative numbers are NEVER palindromes (e.g., -121 vs 121-)
        // Also, if a number ends in 0 (like 10), it can't be a palindrome unless it's 0.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int originalNumber = x;
        long reversedNumber = 0; // Use 'long' to avoid overflow issues during reversal

        // 2. Reverse the number mathematically
        while (x > 0) {
            int lastDigit = x % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            x = x / 10; // Chop off the last digit
        }

        // 3. If the reversed version equals the original, it's a palindrome!
        return originalNumber == (int)reversedNumber;
    }
}
