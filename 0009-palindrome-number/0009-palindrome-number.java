class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rev=0;
        if(x<0){
            return false;
        }
        else{
        while(x!=0){
            rev=(rev*10)+(x%10);
            x=x/10;
        }
        if(rev==num){
            return true;
        }
        return false;
    }}
}