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
    public ListNode deleteDuplicates(ListNode head) {
         if(head==null){
            return null;
        }
       
        ListNode curr = head,prev=null,nt=head.next;
        while(nt!=null){
            if(prev!=null && prev.val==curr.val){
                prev.next = nt;
            }else{
               prev = curr;
               
            }
            curr = nt;
            nt = nt.next;
        }
        if(prev!=null && prev.val==curr.val){
            prev.next = null;
        }
        return head;
    }
}