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
    private ListNode reverseList(ListNode node){
        ListNode prev=null;
        ListNode current=node;
        while(current!=null)
        {
            ListNode next=current.next;

            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode first=head;
        ListNode second=reverseList(slow);

        int max=0;
        while(second!=null)
        {
            int sum=first.val + second.val;
            max=Math.max(max,sum);

            first=first.next;
            second=second.next;
        }
        return max;
    }
}