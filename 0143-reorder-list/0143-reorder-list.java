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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode curr = slow.next; // middle of the ll
        
        //reverse the half of the ll
        ListNode prev = null; 
        slow.next = null;
        while(curr != null){
            ListNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }

        // merge the ll
        ListNode curr1 = head;
        ListNode curr2 = prev;
        while(curr1 != null && curr2 != null){
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }
    }
}