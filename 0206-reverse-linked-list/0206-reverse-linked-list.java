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
  
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode nextNode = current.next; // 1. Store next node
            current.next = previous;          // 2. Reverse current pointer
            previous = current;               // 3. Move previous forward
            current = nextNode;               // 4. Move current forward
        }
        return previous;
    }
}