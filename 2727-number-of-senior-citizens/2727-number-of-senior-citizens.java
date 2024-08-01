class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i=0;i<details.length;i++){
            int a=Character.getNumericValue(details[i].charAt(11));
            int b=Character.getNumericValue(details[i].charAt(12));
            if(a*10+b > 60){
                count++;
            }

        }
        return count;
    }}