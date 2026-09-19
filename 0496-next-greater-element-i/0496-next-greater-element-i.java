class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> great=new HashMap<>();
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(stack.isEmpty()){
                great.put(nums2[i],-1);
                stack.push(nums2[i]);
            }
           else if(stack.peek()>nums2[i]){
                great.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
            }
            else if(stack.peek()<=nums2[i]){
                while(!stack.isEmpty()&&stack.peek()<=nums2[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    great.put(nums2[i],-1);
                }
                else if(stack.peek()>nums2[i]){
                great.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
            }
           }
           int[] ans=new int[nums1.length];
         for(int i=0;i<nums1.length;i++){    
            ans[i]=great.get(nums1[i]);
        }
        return ans;
    }
}