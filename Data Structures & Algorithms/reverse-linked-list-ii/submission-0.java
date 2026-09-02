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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode prev=d;
        for(int i =0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i =0;i<right-left;i++){
            ListNode move=curr.next;
            curr.next=move.next;
            move.next=prev.next;
            prev.next=move;
        }
        return d.next;
        
    }
}