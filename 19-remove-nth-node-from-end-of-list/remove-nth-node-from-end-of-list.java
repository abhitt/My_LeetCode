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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
        
//     }
// }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode curr = head;
        
        // Step 1: Traverse the linked list to find its length
        while(curr != null) {
            len++;
            curr = curr.next;
        }
        
        // Reset temp to the head of the list
        curr = head;
        ListNode prev = null;
        int pos = len - n;
        
        // Special case: If the node to be removed is the head itself
        if(pos == 0) return head.next;
        
        // Step 2: Traverse the list again to reach the node just before the one to be removed
        for(int i = 0; i < pos; i++) {
            prev = curr;
            curr = curr.next;
        }
        
        // Step 3: Update the pointers to remove the node
        prev.next = curr.next;
        
        // Step 4: Delete the removed node
        curr = null;
        
        return head;
    }
}