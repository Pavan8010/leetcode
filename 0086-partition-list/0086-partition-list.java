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
    public ListNode partition(ListNode head, int x) {
        ListNode low = new ListNode();
        ListNode high = new ListNode();
        ListNode lessHead = low;
        ListNode greaterHead = high;
        while(head != null){
            if(head.val<x){
                lessHead.next = head;
                lessHead = lessHead.next;
            }else{
                greaterHead.next = head;
                greaterHead = greaterHead.next;
            }
            head = head.next;
        }
        lessHead.next = high.next;
        greaterHead.next = null;
        return low.next;
    }
}