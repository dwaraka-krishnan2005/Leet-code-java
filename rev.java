class rev {
    public int reverse(int x) {
        int reversedResult = 0;

        while (x != 0) {
            // 1. Get the last digit (e.g., if x is 123, pop is 3)
            int pop = x % 10;
            x = x / 10; // Remove that digit from x (x becomes 12)

            // 2. CHECK FOR OVERFLOW (Before we multiply by 10)
            // Integer.MAX_VALUE is 2,147,483,647
            if (reversedResult > Integer.MAX_VALUE / 10 || 
               (reversedResult == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; 
            }
            
            // Integer.MIN_VALUE is -2,147,483,648
            if (reversedResult < Integer.MIN_VALUE / 10 || 
               (reversedResult == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            // 3. Build the reversed number
            reversedResult = (reversedResult * 10) + pop;
        }

        return reversedResult;
    }
}
