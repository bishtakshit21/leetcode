class Solution {
    public boolean isMonotonic(int[] nums) {
       
                if(nums[0]<nums[nums.length-1]){
                    for(int u=0;u<nums.length-1;u++){
                        if(nums[u]>nums[u+1]){
                            return false;
                        }
                    }
                }
                 else{
                    for(int u=0;u<nums.length-1;u++){
                        if(nums[u]<nums[u+1]){
                            return false;
                        }
                    }
                }
            
        
        return true;
    }
}