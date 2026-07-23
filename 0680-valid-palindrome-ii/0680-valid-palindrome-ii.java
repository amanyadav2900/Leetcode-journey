class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l<r){
            if(s.charAt(l)!= s.charAt(r)){
                return isvalidPalindrome( s ,  l+1 , r ) ||  isvalidPalindrome( s ,  l , r-1 )  ;
        }
        l++;
        r--;
        }
        return true;
        
    }
    public boolean isvalidPalindrome(String s , int l , int r ){
        while(l<r){
            if(s.charAt(l)!= s.charAt(r)){
                return false;

            }
            l++;
            r--;
        }
        return true;
    }
}