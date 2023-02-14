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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next== null)
            return true;
        ArrayList<Integer> lt = new ArrayList<>();
        while(head!=null)
        {
            lt.add(head.val);
            head = head.next;
        }
        int  n = lt.size();
        int i = 0;
        int  j = n - 1;
        // for(int kl:lt)
        //     System.out.println(kl);
        while(i<j)
        {
            if(lt.get(i) == lt.get(j))
            {
                
            }
            else
                return false;
            
            i++;
            j--;
        }
        return true;
    }
}