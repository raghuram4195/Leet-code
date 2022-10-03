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
//         ListNode node1 = head;
//         ListNode node2 = head;
//         int i=5;
//         if(head==null||head.next==null)
//             return false;
//         while(true)
//         {
//             if(node2==null)
//                 return false;
//             if(i==0)
//             {
//                 node1 = node1.next;
//                 i=3;
//             }
//             node2 = node2.next;
//             i--;
//             if(node2==node1)
//                 return true;
            
//         }
        ListNode node1 = head;
        ListNode node2 = head;
        if(head==null)
            return false;
        while(true)
        {
            if(node1==null || node2==null||node2.next==null||node1.next==null||node2.next.next==null)
                return false;
            node1 = node1.next;
            node2 = node2.next.next;
            if(node1==node2)
                return true;
        }
        
    }
}