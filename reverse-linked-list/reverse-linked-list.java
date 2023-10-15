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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, currentPtr = head, nextPtr;
        
        while(currentPtr != null) {
            nextPtr = currentPtr.next;
            currentPtr.next = prev;
            prev = currentPtr;
            currentPtr = nextPtr;
        }
        return prev;
    }
}