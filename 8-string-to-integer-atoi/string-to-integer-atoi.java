class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        int result = 0;
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Handle signs
        if (s.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // Convert characters to integer
        while (index < s.length()) {
            char c = s.charAt(index);
            // Check if the current character is a digit
            if (c < '0' || c > '9') {
                break;
            }

            int digit = c - '0';
            // Handle overflow
            if (result > (maxInt - digit) / 10) {
                return (sign == 1) ? maxInt : minInt;
            }

            // Add current digit to the result
            result = result * 10 + digit;
            index++;
        }

        return sign * result;
    }
}
