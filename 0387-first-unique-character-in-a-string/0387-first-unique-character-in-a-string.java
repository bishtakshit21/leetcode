class Solution {
    public int firstUniqChar(String s) {
         LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
        char[] ch=s.toCharArray();
        for(int i=0 ; i<ch.length ;i++){
            if(hm.containsKey(ch[i])){
                hm.replace(ch[i],hm.get(ch[i])+1);
            }else{
                hm.put(ch[i],1);
            }
        }
       for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey()); // Pass char variable, not "key"
            }
        }
      return -1; 
       }
        

    }
