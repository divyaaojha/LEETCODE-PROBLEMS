/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
// To delete the given node:

// Copy value from next node
// Skip the next node
       
            node.val=node.next.val;
            node.next = node.next.next;
       
        
    
        

    }
}