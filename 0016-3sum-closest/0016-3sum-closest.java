class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int closest = nums[0] + nums[1] + nums[2];  // Initial guess

        // Step 2: Iterate through each number
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Use two pointers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Update closest if this sum is nearer to target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Step 4: Move pointers
                if (sum < target) {
                    left++;  // Need a bigger sum
                } else if (sum > target) {
                    right--; // Need a smaller sum
                } else {
                    return sum; // Exact match found
                }
            }
        }
        return closest;
    }
}