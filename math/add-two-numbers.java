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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Dummy=new ListNode(-1);
        ListNode current=Dummy;
        Dummy.next=current;

        int c=0;
        while(l1!=null || l2!= null)
        {
           int num1=(l1!=null)?l1.val:0;
           int num2=(l2!=null)?l2.val:0;

           int value=num1 + num2 + c;
           int digit=value % 10;
           c=value/10; 
           current.next=new ListNode(digit);
           current=current.next;
           if(l1!=null){
            l1=l1.next;
           }
           if(l2!=null){
            l2=l2.next;
           }
        }
        if(c!=0)
        {
            current.next=new ListNode(c);
        }
        return Dummy.next;
    }
}