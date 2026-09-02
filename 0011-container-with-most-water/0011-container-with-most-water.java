class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            int width=j-i;
            int vol=min*width;
            if(vol>max){
                max=vol;
            }
            if(height[i]<height[j]){
                i++;
            }else
            j--;
        }
        return max;
    }
}