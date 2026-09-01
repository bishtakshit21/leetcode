class Solution {
    public void reverseString(char[] s) {
        int i=s.length/2;
        int j=0;
        int k=s.length-1;
        while(j<i){
            char l=s[j];
            s[j]=s[k];
            s[k]=l;
            j++;
            k--;
        }
    }
}