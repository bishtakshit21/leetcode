class Solution {
    public int removeDuplicates(int[] nums) {
        int o=nums.length;
        for(int i=0,j=1;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            o--;
            continue;
        }
        else{
            nums[j]=nums[i+1];
            j++;
        }
    }
    return o;
}
}