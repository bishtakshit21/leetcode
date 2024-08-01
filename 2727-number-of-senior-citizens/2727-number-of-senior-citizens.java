class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i=0;i<details.length;i++){
            
            // int v[]={o[11] ,o[12]};
            int a=Character.getNumericValue(details[i].charAt(11));
            int b=Character.getNumericValue(details[i].charAt(12));
            int c=a*10+b;
            if(c > 60){
                count++;
            }

        }
        return count;
    }}