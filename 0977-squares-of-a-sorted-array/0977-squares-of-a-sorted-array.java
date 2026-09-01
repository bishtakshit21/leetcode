class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int [] arr=new int[nums.length];
        int k=arr.length-1;
        int i=0;
        int j=nums.length-1;
      
        while(j>=i){
              int leftsquare=nums[i]*nums[i];
        int rightsquare=nums[j]*nums[j];
            if((leftsquare)<(rightsquare)){
                arr[k]=rightsquare;
                j--;
                k--;
            }
            else{
                 arr[k]=leftsquare;
                i++;
                k--;
            }
        }
        return arr;
    }
}