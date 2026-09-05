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
    public ListNode ReverseList(ListNode head){
        ListNode prev=null;
        ListNode current=head;

        while(current!=null)
        {
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        //find mid
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse second part
        ListNode first=head;
        ListNode second=ReverseList(slow.next);
        slow.next=null;

        //merge alternately
        ListNode Dummy=new ListNode(-1,first);
        Dummy.next=first;

        while(second!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }

    }
}