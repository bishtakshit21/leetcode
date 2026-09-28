class Solution {
    public String predictPartyVictory(String senate) {
                Queue <Integer> queueR=new LinkedList<>();
                Queue <Integer> queueD=new LinkedList<>();
                int n=senate.length();
                for(int i=0;i<n;i++){
                    if(senate.charAt(i)=='R')queueR.offer(i);
                    else{queueD.offer(i);}
                }
                while(!queueR.isEmpty()&&!queueD.isEmpty()){
                    if(queueR.peek()<queueD.peek()){
                        queueR.offer(queueR.peek()+n);
                    }else if(queueR.peek()>queueD.peek()){
                        queueD.offer(queueD.peek()+n);
                    }
                    queueR.poll();
                    queueD.poll();
                }
                if(!queueR.isEmpty())return "Radiant";
                else if(!queueD.isEmpty())return "Dire";
                return "hello";
                }
    }