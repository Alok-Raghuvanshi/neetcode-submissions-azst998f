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
    public ListNode mergeKLists(ListNode[] lists) {
          int n=lists.length;
          if(n==0)
          return null;
          ListNode h1=lists[0];
          for(int i=1;i<n;i++)
          {
             ListNode h2=lists[i];
             h1=merge(h1,h2);
          }
          return h1;
    }
    ListNode merge(ListNode h1,ListNode h2)
    {
        ListNode p1=h1,p2=h2;
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=dummy1;
        while(p1!=null&&p2!=null)
        {
            if(p1.val<=p2.val)
            {
                dummy1.next=p1;
                dummy1=dummy1.next;
                p1=p1.next;
            }
            else
            {
                dummy1.next=p2;
                dummy1=dummy1.next;
                p2=p2.next;
            }
        }
            if(p1==null)
        dummy1.next=p2;
        else
        dummy1.next=p1;
         
        return dummy2.next;
    }
}
