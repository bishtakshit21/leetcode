class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack= new ArrayDeque<>();
        int[] arr= new int[temperatures.length];
        int n=temperatures.length;
        for(int i=temperatures.length-1;i>=0;i--){
                while(!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    arr[i]=0;
                 }
                if(!stack.isEmpty()&&temperatures[i]<temperatures[stack.peek()]){
                    arr[i]=stack.peek()-i;
                }
            stack.push(i);
            }
        return arr;
        }
    }