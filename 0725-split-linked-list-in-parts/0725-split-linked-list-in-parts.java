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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        ListNode[] ans = new ListNode[k];
        curr = head;
        ListNode tmp = null;
        int extra = len%k;
        int size = len/k;
        for(int i=0;i<k;i++){
            ans[i] = curr;
            int sz = size + (extra-- > 0 ? 1 : 0);
            for (int j=0;j<sz-1;j++) {
                curr = curr.next;
            }
            if(curr != null){
                tmp = curr.next;
                curr.next = null;
                curr = tmp;
            }
        }
        return ans;
    }
}