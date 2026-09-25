class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        for (int s : sandwiches) stack1.push(s);
        Deque<Integer> stack= new ArrayDeque<>();
        while(!stack1.isEmpty()){stack.push(stack1.pop());}

        Queue <Integer> queue=new LinkedList<>();
        for (int s : students) queue.offer(s);
       
        
        int c=0;
        int m=0;
        int ne=0;
        while(!stack.isEmpty()&&!queue.isEmpty()){
            if(stack.peek()==queue.peek()){
                stack.pop();
                queue.poll();
                c++;
                m=0;
            }
            else{
                queue.offer(queue.poll());
                m++;
            }
            if(m==queue.size()){
                ne=m;
                break;
            }
     
        }   
        return ne;
    }
}