/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast;
        ListNode slow;
        fast = head;
        slow = head;
        while(fast!=null)
        {
            if(fast.next!=null)
                fast = fast.next.next;
            else
                return false;
            
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
        
    }
}