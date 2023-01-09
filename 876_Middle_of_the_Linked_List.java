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
    private int numberOfNodes (ListNode head) {
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            count = count + 1;
            currentNode = currentNode.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        int n = numberOfNodes (head);
        ListNode currentNode = head;
        for (int i = 0; i < (n/2); i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}

