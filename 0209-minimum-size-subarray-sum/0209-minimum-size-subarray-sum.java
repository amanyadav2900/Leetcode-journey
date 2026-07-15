/*class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = 0 ;
        int l= 0;
        int sum= nums[l];
        int min = nums[l] ;
        for (int r = 0 ; r<nums.length; r++){
           sum += nums[l]+nums[r];
            if(sum>=target){
                length = r-l+1;
                min = Math.min(length,min);
                return min;
            }
            

          
        }
        l++;  
          return length;

       
    }
}*/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];  // expand window

            while (sum >= target) {  
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
