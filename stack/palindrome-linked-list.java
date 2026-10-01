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
    public ListNode reverseList(ListNode node){
        ListNode prev=null;
        ListNode current=node;
        while(current != null)
        {
            ListNode next=current.next;

            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) 
    {
        //Find Mid
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //Reverse Second Half
        ListNode second=slow;
        second=reverseList(second);

        ListNode first=head;

        while(second != null)
        {
            if(first.val != second.val)
            {
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;

    }
}