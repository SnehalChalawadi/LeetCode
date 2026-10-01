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
    public ListNode partition(ListNode head, int x) {
        ListNode smalldummy=new ListNode(-1);
        ListNode greaterdummy=new ListNode(-1);
    
        ListNode small=smalldummy;
        ListNode greater=greaterdummy;
        while(head!=null)
        {
            if(head.val < x)
            {
                small.next=head;
                small=small.next;
            }
            else{
                greater.next=head;
                greater=greater.next;
            }
            head=head.next;
        }
        greater.next=null;
        small.next=greaterdummy.next;
        return smalldummy.next;
    }
}