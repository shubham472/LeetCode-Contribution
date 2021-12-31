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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
       
        ListNode curr = head,prev=null,nt=head.next;
        while(nt!=null){
            curr.next=prev;
            prev = curr;
            curr = nt;
            nt = nt.next;
        }
        if(prev!=null){ curr.next=prev;}
        return curr;
    }
}