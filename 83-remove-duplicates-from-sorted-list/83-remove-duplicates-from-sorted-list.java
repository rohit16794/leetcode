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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode currentPtr = head, nextPtr = head.next;
        
        while(nextPtr!=null && currentPtr!=null) {
            if(currentPtr.val == nextPtr.val) {
                currentPtr.next = nextPtr.next;
                nextPtr = nextPtr.next;
            } else{ 
                currentPtr = currentPtr.next;
                nextPtr = currentPtr.next;
            }
        }
        return head;
    }
}