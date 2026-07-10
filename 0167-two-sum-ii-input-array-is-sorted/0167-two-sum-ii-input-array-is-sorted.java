class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length ;
        int left = 0;
        int right = n-1;
        
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if (sum == target){
                
                return new int[] { left + 1, right + 1 };
            }
            else if (sum>target){
                right--;
            }
            else {
                left++;
                
            }
        }
       return new int []{-1,-1} ;
    }

    
}



/*class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Problem requires 1-based indices
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        
        return new int[] { -1, -1 }; // fallback, though problem guarantees a solution
    }
}
*/
 