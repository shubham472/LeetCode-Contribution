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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null,curr =head,t=head; 
        int s=0;
        while(t!=null){
            t=t.next;
            s++;
        }
        int m = s-n;
        if(m==0){
            return head.next;
        }
        while(curr!=null && m>0){
            prev = curr;
            curr = curr.next;
            m--;
        }
        //System.out.println("p"+prev.val);
        //System.out.println("curr"+curr.val);
        if(prev!=null || curr!=null){
           if(curr==null){
               prev.next = null;
           }else{
               prev.next = curr.next;
           }
            return head;
        }else{
            return null;
        }
        
    }
}