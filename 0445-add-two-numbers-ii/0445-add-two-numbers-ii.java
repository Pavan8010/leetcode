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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)  return l2;
        if(l2 == null)  return l1;
        int sum = 0,carry = 0;
        ListNode t1 = reverseList(l1);
        ListNode t2 = reverseList(l2);
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        while(t1!=null || t2!=null){
            sum =((t1 == null)?0:t1.val)+((t2 == null)?0:t2.val)+carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
        }
        
        if(carry!=0) curr.next = new ListNode(carry);
        return reverseList(result.next);
    }

    ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}