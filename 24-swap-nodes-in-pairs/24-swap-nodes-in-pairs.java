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
    public ListNode swapPairs(ListNode head) {
        ListNode cur = new ListNode();
        ListNode prev = new ListNode();
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        cur = head.next;
        prev = head;
        while(cur!=null)
        {
            int temp = cur.val;
            cur.val = prev.val;
            prev.val = temp;
            if(cur.next==null||cur.next.next==null)
                return head;
            cur = cur.next.next;
            prev = prev.next.next;
        }
        return head;
    }
}