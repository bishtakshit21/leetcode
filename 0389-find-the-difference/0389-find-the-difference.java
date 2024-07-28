import java.util.Arrays;
class Solution {
    public char findTheDifference(String s, String t) {
        char w='f';
        char c[]=s.toCharArray();
        char d[]=t.toCharArray();
        Arrays.sort(c);
       
        Arrays.sort(d);
        String a=new String(c);
         a=a+' ';
        String b=new String(d);
        for(int i=0;i<b.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return b.charAt(i);
            }
        }
return w;

    }
}