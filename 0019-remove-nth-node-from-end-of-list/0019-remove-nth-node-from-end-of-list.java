class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        int size =0;
        ListNode curr = head;
        while(curr != null){
            curr=curr.next;
            size++;
        }
        if(n == size)return head.next;
        int indexToSearch = size-n,i = 1;
        ListNode prev = head;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}