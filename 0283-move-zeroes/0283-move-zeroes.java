class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=0;
            if(nums[i]==0){
          for(int j=i+1;j<n;j++){
            if(nums[j]!=0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                break;
            }
           }
        }
        }
    }
}