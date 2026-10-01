class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> majority=new HashMap<>();
       int max=0;
       int maxe=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(majority.containsKey(nums[i])){
            majority.put(nums[i],majority.get(nums[i])+1);
        }else{
             majority.put(nums[i],1);
        }
         if(majority.get(nums[i])>max){
                max=majority.get(nums[i]);
                maxe=nums[i];
                };
       }
       return maxe;
    }
}