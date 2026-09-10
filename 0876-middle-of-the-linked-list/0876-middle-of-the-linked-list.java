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
    
    public ListNode middleNode(ListNode head) {
        ListNode middle=head;
        ListNode current=head;
        while(current!=null&&current.next!=null){
            current=current.next.next;
            middle=middle.next;
        }
        // while(middle!=null){
        //     middle=current.next;
        //     System.out.println(middle);
        // }
    return middle;
    }
}