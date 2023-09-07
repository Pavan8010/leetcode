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
public class Solution {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode leftPrev = tmp;
        ListNode left = tmp.next;
        int leftcnt = 1;
        while (leftcnt < l) {
            leftPrev = left;
            left = left.next;
            leftcnt++;
        }
        ListNode right = left;
        ListNode rightNext = left.next;
        int rightcnt = 0;
        while (rightcnt<r-l) {
            right = rightNext;
            rightNext = rightNext.next;
            rightcnt++;
        }
        ListNode cur = left;
        ListNode pre = null;
        while (cur != rightNext) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        leftPrev.next = right;
        left.next = rightNext;
        head = tmp.next;
        return head;
    }
}