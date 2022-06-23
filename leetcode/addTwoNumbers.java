/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

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
        
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result= new ListNode(0);
        ListNode head = result;
                
        while(l1 != null|| l2 !=null){   
           result.val = ((l1==null)? 0: l1.val ) +
                        ((l2==null)? 0: l2.val ) +
                        carry;
           carry= result.val/10;
           result.val=result.val%10;
            
           if(l1!=null)l1=l1.next;
           if(l2!=null)l2=l2.next;
           if(l1!=null || l2!=null){
               result.next = new ListNode();
               result = result.next;
           }
        }
        
        if(carry>0){
          
          result.next = new ListNode(carry);   
        }
        
        
        return head;
    }
}
