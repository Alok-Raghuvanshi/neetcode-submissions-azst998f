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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode prev1=new ListNode(-1);
        ListNode prev2=new ListNode(-1); 
      ListNode p1=l1,p2=l2;
      prev1.next=p1;
      prev2.next=p2;
      int carry=0;int sum=0;
      while(p1!=null&&p2!=null)
      {
         sum=p1.val+p2.val+carry;
        if(sum<10)
        {
        p1.val=sum;
        carry=0;
        }
        else
        {
        p1.val=sum-10;
        carry=1;
        }
        p1=p1.next;
        p2=p2.next;
        prev1=prev1.next;
        prev2=prev2.next;
      } 
      if(carry==0)
      {
        if(p1==null)
        prev1.next=p2;
      }
       if(carry!=0)
       {
        if(p1==null&&p2!=null)
        {
            while(p2!=null)
            {
                sum=p2.val+carry;
                if(sum<10)
                {
                    p2.val=sum;
                    prev1.next=p2;
                    break;
                }
                    else
                    {
                        p2.val=sum-10;
                        carry=1;
                        prev1.next=p2;
                        prev1=prev1.next;
                    }
                    p2=p2.next;
                    prev2=prev2.next;
            }
            if(carry!=0)
             {
                ListNode v=new ListNode(1);
                v.next=null;
                prev2.next=v;
             }
        }
        if(p1!=null&&p2==null)
        {
            while(p1!=null)
            {
                sum=p1.val+carry;
                if(sum<10)
                {
                    p1.val=sum;
                   
                    return l1;
                }
                    else
                    {
                        p1.val=sum-10;
                        carry=1;
                        
                    }
                    p1=p1.next;
                    prev1=prev1.next;
            }
            if(carry!=0)
             {
                ListNode v=new ListNode(1);
                v.next=null;
                prev1.next=v;
             }
        }
        if(p1==null&&p2==null)
        {
           ListNode v=new ListNode(1);
           prev1.next=v;
           v.next=null; 
        }
       }
      
      return l1; 
    }
}
