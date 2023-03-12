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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        List<Integer> arr = new ArrayList<>();
        for(ListNode curr : lists){
            while(curr != null){
                arr.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(arr);
        ListNode ans = null;
        ListNode temp = null;
        for(Integer i:arr){
            if(ans == null){
                ans = new ListNode(i);
                temp = ans;
            }else{
                ans.next = new ListNode(i);
                ans = ans.next;
            }
        }
        return temp;    
    }
}