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
    public ListNode removeZeroSumSublists(ListNode head) {
      
        ListNode dummy = new ListNode(0, head);
        Map<Integer, ListNode> mapSum = new HashMap<>();
      
        int sum = 0;
        ListNode current = dummy; 
        while (current != null) {
            sum += current.val;
            mapSum.put(sum, current);
            current = current.next;
        }
      
        sum = 0; // Reset the sum for the second pass
        current = dummy; // Reset current node to the dummy head
      
        // Second pass: Remove zero-sum sublists
        while (current != null) {
            sum += current.val; // Update the cumulative sum
            current.next = mapSum.get(sum).next;
          
            current = current.next; 
        }
      
        return dummy.next; 
        
    }
}