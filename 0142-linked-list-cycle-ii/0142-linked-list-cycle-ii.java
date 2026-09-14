/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer> link=new HashMap<>();
        ListNode current=head;
        if(head==null){
            return null;
        }else{
        while(current.next!=null){
            if(link.containsKey(current)){
                return current;
            }else{
                link.put(current,1);
            }
            current=current.next;
        }}
        return null;
    }
}