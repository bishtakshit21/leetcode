class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()>=needle.length()){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(i+needle.length()<=haystack.length()){
                s.append(haystack.substring(i,i+needle.length()));
                System.out.println(s.toString());
            }}
            if(needle.equals(s.toString())){
                return i;
            }
            s.setLength(0);
        }
        return -1;
        }
        else{
            return -1;
        }
    }
}