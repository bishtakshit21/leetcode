class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int item:nums){
            if(count.containsKey(item)){
                return true;
            }
            else{
                count.put(item,1);
            }
        }
        return false;
    }
}