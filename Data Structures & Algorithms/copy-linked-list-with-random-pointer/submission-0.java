/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
    return null;
          HashMap<Node,Node>map2=new HashMap<>();
     Node p=head;
     Node h=new Node(p.val);
     map2.put(p,h);
     Node hh=h;
     p=p.next;
     while(p!=null)
     {
       Node nw=new Node(p.val);
        map2.put(p,nw);
       h.next=nw;
       p=p.next;
       h=h.next;
     }
     Node pp=head;
     p=hh;
     while(p!=null)
     {
        p.random=map2.get(pp.random);
        p=p.next;
        pp=pp.next;
     }
     return hh;
    }
}
