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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=dummy1;
        ListNode p1,p2;
        p1=list1;p2=list2;

        while(p1!=null&&p2!=null)
        {
            if(p1.val<=p2.val)
            {
                dummy1.next=p1;
                p1=p1.next;
                dummy1=dummy1.next;
            }
            else
            {
                dummy1.next=p2;
                p2=p2.next;
                dummy1=dummy1.next;
            }
        }
        if(p1==null)
        dummy1.next=p2;
        else
        dummy1.next=p1;

        return dummy2.next;
    }
}