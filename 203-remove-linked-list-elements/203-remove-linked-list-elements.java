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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode prevPtr = dummyNode, currentPtr = head;
        
        while(currentPtr!=null) {
            if(currentPtr.val == val) {
                prevPtr.next = currentPtr.next;
            } else prevPtr = currentPtr;
            currentPtr = currentPtr.next;
        }
        return dummyNode.next;
    }
}