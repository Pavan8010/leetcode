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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        ListNode last = head;
        if(head == null || head.next==null || k==00)return head;
        int size = lengthOfLL(head);
        k = k%size;
        while(k>0){
            while(curr.next !=  null){
                last = curr;
                curr = curr.next;
            }
            last.next = null;
            curr.next = head;
            head = curr;
            k--;
        }
        return head;
    }
    public int lengthOfLL(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}