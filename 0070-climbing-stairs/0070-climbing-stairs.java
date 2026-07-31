class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;  // Base cases: 1 → 1 way, 2 → 2 ways

        int first = 1;  // ways to reach step 1
        int second = 2; // ways to reach step 2

        // From step 3 onwards, ways = sum of previous two
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
