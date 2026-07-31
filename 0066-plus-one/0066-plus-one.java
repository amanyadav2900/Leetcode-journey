class Solution {
    public int[] plusOne(int[] digits) {
        // Traverse from the last digit backwards
        for (int i = digits.length - 1; i >= 0; i--) {
            // If current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, it becomes 0 (carry over)
            digits[i] = 0;
        }
        
        // If all digits were 9, we need a bigger array
        int[] result = new int[digits.length + 1];
        result[0] = 1; // e.g., 999 + 1 = 1000
        return result;
    }
}
