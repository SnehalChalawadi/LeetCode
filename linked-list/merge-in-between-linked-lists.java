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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1=list1;
        ListNode l2=list2;

        ListNode current=l1;
        for(int i=1;i<a;i++)
        {
            current=current.next;
        }
        ListNode temp=current.next;
        current.next=l2;

        for(int i=a;i<=b;i++)
        {
            temp=temp.next;
        }

        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=temp;

        return l1;
    }
}