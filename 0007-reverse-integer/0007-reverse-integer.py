class Solution:
    def reverse(self, x: int) -> int:
        # Define 32-bit integer limits
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        
        # Handle sign
        sign = -1 if x < 0 else 1
        x *= sign
        
        # Reverse digits
        reversed_num = 0
        while x != 0:
            digit = x % 10
            x //= 10
            reversed_num = reversed_num * 10 + digit
        
        # Apply sign back
        reversed_num *= sign
        
        # Check overflow
        if reversed_num < INT_MIN or reversed_num > INT_MAX:
            return 0
        return reversed_num
