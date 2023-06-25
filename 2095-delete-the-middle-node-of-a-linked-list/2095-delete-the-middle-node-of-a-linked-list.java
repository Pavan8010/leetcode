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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        if(head.next.next==null){
            head.next = null;
            return head;
        }
        int len = 0;
        ListNode tmp = head;
        while(tmp!=null){
            len++;
            tmp = tmp.next;
        }
        int mid = len/2;
        int i=0;
        ListNode prev = head;
        while(i<mid-1){
            prev = prev.next; 
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}