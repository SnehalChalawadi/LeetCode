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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
       int length=1;
       ListNode current=head;
       while(current.next!=null)
       {
        length++;
        current=current.next;
       }

       k=k % length;
       if(k==0)
       {
        return head;
       }

       current.next=head; 
       int steps=length-k;
       current=head;
       for(int i=1;i<steps;i++)
       {
        current=current.next;
       }
       head=current.next;
       current.next=null;
       return head;
    }
}