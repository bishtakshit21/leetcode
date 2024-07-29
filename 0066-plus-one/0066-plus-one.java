class Solution {

    public static int[] plusOne(int[] digits) {

       
        int h=digits.length;
        for( int i=digits.length-1;i>=0;i--){
            digits[i]=digits[i]+1;
            if((digits[i]%10)!=0){
                return digits;
            }
            else{
                digits[i]=0;
            }           
        }
        digits =new int[h+1];
        digits[0]=1;
        return digits;
    }}