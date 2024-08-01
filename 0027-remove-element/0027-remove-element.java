class Solution {
    public int removeElement(int[] nums, int val) {
        int count=nums.length;
        
        for(int i=0,k=0;i<nums.length;i++){
            if(nums[i]==val){
                 count--;
                continue;
           
            }
            else{
                nums[k]=nums[i];
                k++;
            }

    }
return count;
}
}