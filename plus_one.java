class plius_one {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If digit is < 9, no carry is needed after this
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If digit is 9, it becomes 0 and we carry over to the next
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9 (e.g., [9, 9, 9])
        // We need a new array like [1, 0, 0, 0]
        int[] result = new int[n + 1];
        result[0] = 1;
        // The rest are 0 by default in Java
        return result;
    }
}
