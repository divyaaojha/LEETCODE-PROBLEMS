/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getintersect(ListNode small, ListNode large, int smallsize, int largesize){
            ListNode inter =null;
            int diff = largesize-smallsize;
            while(diff != 0 ){
                large= large.next;
                diff--;
            }
            // now our small is at position of intersect if any
            while(large != null && small != null){
                if(large == small)return small;
                large = large.next;
                small= small.next;
            }
            return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // finding length of a and b list
        int lenA =0;
        int lenB =0;
        ListNode headAA= headA;
        ListNode headBB = headB;
        while(headAA != null){
            lenA++;
            headAA= headAA.next;
        }
        //headaa becomes null
        while(headBB != null){
            lenB++;
            headBB=headBB.next;
        }
        //headbb becomes null
        if (lenA < lenB){
           return  getintersect(headA, headB, lenA, lenB);
        }
       
        return getintersect(headB, headA, lenB, lenA);
        

    }
}