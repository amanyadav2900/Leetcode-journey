class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        // Step 1: Trim leading/trailing spaces
        s = s.trim();
        if (s.length() == 0) return 0;

        // Step 2: Handle sign
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits
        long result = 0; // use long to detect overflow
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;

            // Step 4: Clamp to 32-bit range
            if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }

        return (int)(sign * result);
    }
}
