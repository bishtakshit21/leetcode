class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(n>0){
       for(int i=m;i<m+n;i++){
        nums1[i]=nums2[i-m];
       }
       Arrays.sort(nums1);
    }
}
}