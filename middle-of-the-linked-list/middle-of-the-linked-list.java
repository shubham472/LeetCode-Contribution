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
    public ListNode middleNode(ListNode head) {
        ListNode t = head;
        int s=0;
        while(t!=null){
            t=t.next;
            s++;
        }
        int c=s/2;
        while(c>0){
            head=head.next;
            c--;
        }
        return head;
        
    }
}