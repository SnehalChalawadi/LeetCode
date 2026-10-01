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
    public ListNode oddEvenList(ListNode head) {
        ListNode odddummy=new ListNode(-1);
        ListNode odd=odddummy;

        ListNode evendummy=new ListNode(-1);
        ListNode even=evendummy;

        while(head!=null && head.next!=null)
        {
            odd.next=head;
            head=head.next;
            odd=odd.next;

            even.next=head;
            head=head.next;
            even=even.next;
        }
        if(head!=null)
        {
            odd.next=head;
            odd=odd.next;
        }
        even.next=null;
        odd.next=evendummy.next;
        return odddummy.next;
    }
}