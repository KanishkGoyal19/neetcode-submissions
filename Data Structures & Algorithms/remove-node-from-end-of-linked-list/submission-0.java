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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = head;

        while(n> 0){ //move the pointer n steps ahead
            right = right.next;
            n--;
        }

        while(right != null){ //move the points to the end of the list and jsut before the element
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;  //skip the element
        return dummy.next;  //return

    }
}
