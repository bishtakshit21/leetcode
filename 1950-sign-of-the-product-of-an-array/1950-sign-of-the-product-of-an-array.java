class Solution {
    public int arraySign(int[] nums) {
        long n=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count++;
            }
            if(nums[i]==0){
                return 0;
            }
        }
        // if(n==0){
        //     return 0;
        // }
        if(n!=0){
            if(count%2==0){
                return 1;
            }
        }
        return -1;
    }
}