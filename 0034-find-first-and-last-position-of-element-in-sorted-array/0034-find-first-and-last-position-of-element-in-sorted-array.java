class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fst = fsto(nums,target);
        int lst = lsto(nums,target);
        return new int[]{fst,lst};

    }
    public int fsto(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int res = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid]== target){
                 res = mid;
                 r= mid-1; }
            else if(nums[mid]<target){
                l = mid +1;
            }
           
           
            else r = mid -1;
        }
        return res;
    }
    public int lsto(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int res = -1;
        while(l<=r){
            int mid = l+(r-l+1)/2;
            if (nums[mid]== target){
                 res = mid;
                 l= mid+1;
            }
            else if(nums[mid]<target){
                l= mid +1;
            }
            
            else r = mid -1;
        }
        return res;
    }
}