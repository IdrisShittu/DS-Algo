/**
Given the head of a linked list, rotate the list to the right by k places.
Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]


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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null) return head;
         
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        
        if(k==size)return head;
        
        temp.next=head;
        
        k=k%size;
        
        while(size!=k+1){
            head=head.next;
            size--;
        }
        
        temp=head.next;
        head.next=null;
        return temp;
        
        
        /* O(k*n)
        if (head == null || head.next == null) return head;
        for (int i = 0; i < k; i++) {
            ListNode temp = head;
            while (temp.next.next != null) temp = temp.next;
             ListNode end = temp.next;
             temp.next = null;
             end.next = head;
             head = end;
        }
        return head;
        */
    }
}
