class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sr=new StringBuilder();
        int n=s.length();
        int i=1;
        while(i<=(n/2)){
            if(n%i==0){
                String str=s.substring(0,i);
                for (int k=0;k<n/i;k++){
                    sr.append(str);
                }
            }
            if(s.equals(sr.toString())){
                return true;

            }
            sr.setLength(0);
            i++;
        }
        return false;
    }
}