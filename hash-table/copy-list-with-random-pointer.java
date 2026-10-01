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
        Node current=head;
        while(current!=null)
        {
            Node copy=new Node(current.val);
            copy.next=current.next;

            Node temp=current.next;
            copy.next=temp;
            current.next=copy;

            current=copy.next;
        }

        current=head;
        while(current!=null && current.next !=null)
        {
            Node copy=current.next;
            if(current.random!=null){
                copy.random=current.random.next;
            }
            current=copy.next;
        }

        Node dummy=new Node(-1);
        Node copyCurrent=dummy;
        current=head;
        while(current!=null && current.next!=null)
        {
            Node copy = current.next;

            // Add copy to copied list
            copyCurrent.next = copy;
            copyCurrent = copy;

            // Restore original list
            current.next = copy.next;

            // Move to next original node
            current = current.next;
        }
        return dummy.next;
    }
}