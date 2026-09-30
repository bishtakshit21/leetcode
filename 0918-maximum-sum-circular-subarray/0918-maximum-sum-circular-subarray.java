class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cmax=nums[0];
        int cmin=nums[0];
        int mmax=nums[0];
        int mmin=nums[0];
        int tmax=nums[0];
        int z=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            cmax=Math.max(nums[i],cmax+nums[i]);
            cmin=Math.min(nums[i],cmin+nums[i]);
            mmax=Math.max(cmax,mmax);
            mmin=Math.min(cmin,mmin);
            tmax=tmax+nums[i];
        }
         z=Math.max(mmax,tmax-mmin);
        if(z==0){
            int g=nums[0];
            for(int i=1;i<n;i++){
              g=Math.max(g,nums[i]);
            }
            return g;
        }
        return z;
    }
}