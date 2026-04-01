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
       ListNode p=head;
       int l=0;
       while(p!=null)
       {
          p=p.next;
          l++;
       }
       if((l-n)==0)
       return head.next;
       System.out.println(l+" , "+(l-n+1));
       int i=0;
       
       ListNode p1=head;
       ListNode p2=head.next;
       while(i<(l-n)-1)
       {
        p1=p1.next;
        p2=p2.next;
        i++;
       }
       p1.next=p2.next;
        return head;
    }
}
