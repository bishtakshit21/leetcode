class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }}
        if(count==nums.length-1){
            return true;
        }
        else if(nums.length==2){
            return true;
        }


        else{
            for(int j=0;j<nums.length;j++){
                int c=0;
                int temp=nums[nums.length-1];
                for(int i=nums.length-1;i>0;i--){
                    nums[i]=nums[i-1];
                }
                nums[0]=temp;

                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]<=nums[i+1]){
                        c++;
                    }}
                System.out.println(c);
                if(c==nums.length-1){
                    return true;
                }

            }
        }
        return false;

    }
}