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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode next,temp=head;
        while(temp!=null)
        {
            ListNode kth=kthnode(temp,k);
            if(kth==null)
            {
                if(prev!=null)
                prev.next=temp;

                break;
            }
            next=kth.next;
            kth.next=null;
            ListNode h=reverse(temp);
            if(temp==head) head=h;
            else
            {
                prev.next=h;
            }
            prev=temp;
            temp=next;
        }
          return head;
    }
    ListNode kthnode(ListNode temp,int k)
    {
       while(temp != null && k > 1) {
        temp = temp.next;
        k--;
    }
    return temp;
    }
    ListNode reverse(ListNode temp)
    {
        if(temp==null) return null;
    ListNode cur=temp,prev=null,next=cur;
    while(cur!=null)
    {
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }
    return prev;
    }
}
