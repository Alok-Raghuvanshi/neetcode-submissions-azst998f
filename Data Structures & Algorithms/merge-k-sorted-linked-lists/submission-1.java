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
        if(lists.length==0) return null;
        class Pair
        {
            int key;
            ListNode node;
                Pair(int key,ListNode node)
            {
                this.key=key;
                this.node=node;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair a,Pair b)->a.key-b.key);
            for(int i=0;i<lists.length;i++)
            {
                if(lists[i] != null)
                pq.add(new Pair(lists[i].val,lists[i]));
            }
            ListNode dummy=new ListNode(-1);
            ListNode temp=dummy;
            while(!pq.isEmpty())
            {
                Pair p=pq.poll();
                ListNode n=p.node;
                temp.next=n;
                if(n.next!=null)
                pq.add(new Pair(n.next.val,n.next));
                temp=temp.next;
            }
            return dummy.next;
        }
    }
