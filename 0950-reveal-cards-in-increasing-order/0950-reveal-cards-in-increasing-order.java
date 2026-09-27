class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue <Integer> queue=new LinkedList<>();
        int[] arr=new int[deck.length];
        int[] arrs=new int[deck.length];
        int z=0;
        for (int i=0;i<deck.length;i++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            arr[z]=queue.poll();
            if(!queue.isEmpty()) {
                 queue.offer(queue.poll());
                 }
            z++;
        }
        Arrays.sort(deck);
        for(int j=0;j<deck.length;j++){
           arrs[arr[j]]=deck[j];
        }
        return arrs;
    }
}