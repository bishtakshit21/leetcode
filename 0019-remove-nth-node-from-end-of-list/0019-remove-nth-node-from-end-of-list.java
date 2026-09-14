/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode c=head;
        ListNode p=null;
        while(c!=null){
            ListNode temp=c.next;
            c.next=p;
            p=c;
            c=temp;
        }
       head=p;
        ListNode current=head;
        ListNode prev=null;
        if(head.next==null){
            return null;
        }{
        int i=1;
        while(i<n){
            prev=current;
            current=current.next;
            i++;
        }
        if(i==1){
            head=head.next;
        }else{
        prev.next=prev.next.next;
        }}

         ListNode cu=head;
        ListNode pr=null;
        while(cu!=null){
            ListNode temp=cu.next;
            cu.next=pr;
            pr=cu;
            cu=temp;
        }
       head=pr;
        return head;
    }
}