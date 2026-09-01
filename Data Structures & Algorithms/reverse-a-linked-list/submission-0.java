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
    public ListNode reverseList(ListNode head) {
        ListNode after=head;
        ListNode before = null;
        while(after!=null){
            ListNode next=after.next;
            after.next=before;
            before=after;
            after=next;
        }
        return before;
        
        

        
    }
}
