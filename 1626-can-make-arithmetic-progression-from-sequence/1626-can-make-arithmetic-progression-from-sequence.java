class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=2){
            return true;
        }
        for(int i=0;i<arr.length-2;i++){
        int n=arr[i+1]-arr[i];
        int p=arr[i+2]-arr[i+1];
        if(n!=p){
            return false;
        }
        
    }
    return true;
}
}