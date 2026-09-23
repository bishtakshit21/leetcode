class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack=new ArrayDeque<>();
       int n=asteroids.length;
       for(int i=0;i<n;i++){
        if(asteroids[i]>0){
            stack.push(asteroids[i]);
        }
        else{
            while(!stack.isEmpty()&&stack.peek()>0&&stack.peek()<(-asteroids[i])){
                stack.pop();
            }
            if(!stack.isEmpty()&&stack.peek()==(-asteroids[i])){
               stack.pop();
            }
            else if(stack.isEmpty()||stack.peek()<0){
                 stack.push(asteroids[i]);
            }
        }
       } 
     Deque<Integer> stack1=new ArrayDeque<>();
     while(!stack.isEmpty()){
        stack1.push(stack.pop());
     }
      int[] intArray = stack1.stream().mapToInt(Integer::intValue).toArray();
    return intArray;
    }

}