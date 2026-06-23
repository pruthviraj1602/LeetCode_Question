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

        if (head == null) {
            return head;
        }

        int size = 0;
        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        // Remove head
        if (n == size) {
            head = head.next;
            return head;
        }

        int index = size - n;

        ListNode temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}