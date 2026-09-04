class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
            int j=sarr.length;
            int k=tarr.length;
            if(j!=k){
                return false;
            }
        for(int i=0;i<j;i++){
            if(sarr[i]==tarr[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}