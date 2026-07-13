class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int product = 1;
        int l = 0;
       
        int sbarcnt = 0 ;
        for(int r = 0 ; r<n; r++){
         
            product *= nums[r];
           while(k<=product){
             product /= nums[l];
             l++;
           }
        
             sbarcnt += r-l+1;
            
            
        }  
          
        
       return sbarcnt; 
    }
}