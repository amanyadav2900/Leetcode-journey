class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int total = carry;
            if (i >= 0) {
                total += a.charAt(i) - '0'; // convert char to int
                i--;
            }
            if (j >= 0) {
                total += b.charAt(j) - '0';
                j--;
            }

            result.append(total % 2); // add binary digit
            carry = total / 2;        // update carry
        }

        return result.reverse().toString();
    }
}
