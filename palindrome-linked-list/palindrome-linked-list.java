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
    public boolean isPalindrome(ListNode head) {
        int lengthOfList = getLengthOfList(head);

        ListNode headOfSecondHalf = head;
        for(int i = 1; i <= lengthOfList/2; i++) {
            headOfSecondHalf = headOfSecondHalf.next;
        }

        ListNode headNodeOfReverserList = reverseList(headOfSecondHalf);

        for(int i = 1; i <= lengthOfList/2; i++) {
            if(head.val != headNodeOfReverserList.val) {
                return false;
            }
            head = head.next;
            headNodeOfReverserList = headNodeOfReverserList.next;
        }
        return true;
    }

    private int getLengthOfList(ListNode head) {
        int length = 0;
        while(head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, currPtr = head, nextPtr;

        while(currPtr != null) {
            nextPtr = currPtr.next;
            currPtr.next = prev;
            prev = currPtr;
            currPtr = nextPtr;
        }
        return prev;
    }
}