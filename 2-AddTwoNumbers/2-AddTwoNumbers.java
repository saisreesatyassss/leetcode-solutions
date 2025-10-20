// Last updated: 10/20/2025, 1:33:05 PM
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
        ListNode dummy = new ListNode(0);
        ListNode current=dummy;
        int carry=0;


        while(l1 !=null ||l2 !=null ||carry!=0){
            int digit1=(l1!=null)?l1.val:0;
            int digit2=(l2!=null)?l2.val:0;

            int sum=digit1+digit2+carry;
            int digit=sum%10;
            carry=sum/10;

            current.next=new ListNode(digit);

            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
     return dummy.next;    
    }
}