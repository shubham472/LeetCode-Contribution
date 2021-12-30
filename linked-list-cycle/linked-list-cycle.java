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
        if(head==null){return false;}
        ListNode l = head,m=head;
        while(m.next!=null && m.next.next!=null){
            l = l.next;
            m = m.next.next;
            if(l==m){
                return true;
            }
        }
        return false;
    }
}