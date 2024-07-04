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
    public ListNode mergeNodes(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        int sum =0;

        while(s!=null){
            s=s.next;
            if(s!=null && s.val!=0)
            {
                sum += s.val;
            }else if(s!=null && s.val==0)
            {
                f.val = sum;    
                sum = 0;
                if(s.next!=null){
                    f = f.next;
                }
            }
        }

            if(f!=null){
                f.next = null;
            }
            
        
        return head;
    }

}