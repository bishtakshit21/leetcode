class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        int z=0;
        while(!queue.isEmpty()){
            for(int i=1;i<k;i++){
                queue.offer(queue.poll());
            }if(!queue.isEmpty()){
            z=queue.poll();
        }}
        return z;
    }
}