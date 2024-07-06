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

        ListNode prev = null;
        while(curr!=null){
            len++;
            curr = curr.next;
        }

        
        int pos = len-n;

        if(pos==0){
            return head.next;
          }

        curr = head;

        for(int i=0; i<pos; i++){
           prev = curr;
           curr = curr.next; 
         }

          prev.next = curr.next;
          curr = null;
          return head;
        }
}






 // while(curr != null) {
        //     len++;
        //     curr = curr.next;
        // }
        
        // curr = head;
        // ListNode prev = null;
        // int pos = len - n;
        
        // if(pos == 0) return head.next;
        
        // for(int i = 0; i < pos; i++) {
        //     prev = curr;
        //     curr = curr.next;
        // }
        
        // prev.next = curr.next;
        
        // curr = null;
        
        // return head;