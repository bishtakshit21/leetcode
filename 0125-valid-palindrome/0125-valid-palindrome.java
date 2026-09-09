class Solution {
    public boolean isPalindrome(String s) {
      String t=s.replaceAll("[^a-zA-Z0-9]", "");
      String u=t.toLowerCase();
      char[] arr=u.toCharArray();
      char[] arrn=new char[arr.length];
      int v=arrn.length-1;
      for(int i=0;i<arr.length;i++){
        arrn[v]=arr[i];
        v--;
      }
      String w=new String(arrn);
      if(w.equals(u)){return true;}
      return false;
    }
}