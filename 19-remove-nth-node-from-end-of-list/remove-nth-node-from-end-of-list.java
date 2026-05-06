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

        // find length of LL
        if(head ==null )return null;
        ListNode temp = head;
        ListNode temp1=head;
        int len =0;
        while(temp != null){
            len++;
            temp = temp.next;
        }

         if(n == len){
            return head.next;
        }
        int i = len -n +1;
        len =1;
        while(temp1 != null){
            if(len == i-1){
                
                temp1.next = temp1.next.next;
            }
            len++;
            temp1 = temp1.next;
        }
        
        return head;

    }
}