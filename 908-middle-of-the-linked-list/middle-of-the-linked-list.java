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
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(slow !=null && fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;

        //brute force approach - accepted ************************************************************************
        // if(head.next ==null)return head;
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }
        // if(count % 2 !=0){
        //     int ele =0;
        //     ListNode temp1=head;
        //     while(temp1 != null){
        //         ele++;
        //         if(ele == count/2 ){
        //             temp1 = temp1.next;
        //             return temp1;
        //         }
        //         temp1= temp1.next;
        //     }

        // }
        // else{
        //     ListNode temp2 = head;
        //     int ele=0;
        //      while(temp2 != null){
        //         ele++;
        //         if(ele == count/2 ){
        //             temp2 = temp2.next;
        //             return temp2;
        //         }
        //         temp2= temp2.next;
        //     }

        // }
        // return null;
    }
}