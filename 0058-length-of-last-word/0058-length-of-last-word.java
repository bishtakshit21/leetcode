class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
          String h=  s.trim();
        if(h.length()==1){
            return 1;
        }
    
        for(int i=h.length()-1;i>=0;i--){
            if(h.charAt(i)==' '){
                break;
            }
            count++;
        }
        
        return count;
    }
}