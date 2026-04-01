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
    public void reorderList(ListNode head) {
     ListNode mid,p2;
     mid=head;
     p2=head;
     while(p2.next!=null&&p2.next.next!=null)
     {
      mid=mid.next;
      p2=p2.next.next;
     }
    //  System.out.println(mid.val);
    p2=head;
    ListNode p=null,c=mid.next,n;
    mid.next=null;
    while(c!=null)
    {
        n=c.next;
        c.next=p;
        p=c;
        c=n;
    }
     ListNode p3=p;
      while(p3!=null)
     {
        ListNode t1=p2.next;
        ListNode t2=p3.next;
        p2.next=p3;
        p3.next=t1;

        p2=t1;
        p3=t2;

     }
     
    }
}
