/**
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = list1;
        ListNode temp1;
        int temp;
        
        if(list1==null && list2==null)return list1;
        else if(list1==null)return list2;
        else if(list2==null)return list1;
        
        while(list1 != null && list2 != null ){
            
            if(list2.val < list1.val){
               
                temp = list1.val;
                list1.val = list2.val;
                temp1= list1.next;
                list1.next = new ListNode(temp);
                list1.next.next=temp1;
                if(list1.next==null)break;
                list1 = list1.next;
                list2 = list2.next;
                
            }else {
                if(list1.next==null)break;
                list1=list1.next;
            }
        }

        if(list2!=null)list1.next=list2;
        
        return head;
    }
}
