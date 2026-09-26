class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <Integer> queue=new LinkedList<>();
        int o=0;
        for(int t:tickets){
            queue.offer(o);
            o++;
        }
        int i=1;
        while(!queue.isEmpty()){
            if(tickets[queue.peek()]>1) {
            tickets[queue.peek()]=tickets[queue.peek()]-1;
                queue.offer(queue.poll());
                }
            else{
                int j=queue.poll();
                if(j==k){
                    return i;
                }
                }
            i++;
        }
        return i;
    }
}