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
    public boolean hasCycle(ListNode head) {
        ListNode firstPtr = head;
        ListNode secondPtr = head;
        while(firstPtr !=null && firstPtr.next !=null){
            firstPtr = firstPtr.next.next;
            secondPtr = secondPtr.next;
            if(secondPtr == firstPtr){
                return true;
            }
        }
        return false;
        
    }
}
