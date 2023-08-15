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
        ListNode less = new ListNode();
        ListNode high = new ListNode();
        ListNode lessHead = less;
        ListNode highHead = high;
        while(head != null){
            if(head.val<x){
                lessHead.next = head;
                lessHead = lessHead.next;
            }else{
                highHead.next = head;
                highHead = highHead.next;
            }
            head = head.next;
        }
        lessHead.next = high.next;
        highHead.next = null;
        return less.next;
    }
}