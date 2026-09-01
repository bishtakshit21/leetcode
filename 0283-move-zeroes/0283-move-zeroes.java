class Solution {
    public void moveZeroes(int[] nums) {
      int k=0;
      int j=nums.length-1;
      int[] arr=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            arr[j]=0;
            j--;
        }
        else{
            arr[k]=nums[i];
            k++;
        }
      }  
   for(int i=0;i<arr.length;i++){
   nums[i]=arr[i];
   }
    }
}