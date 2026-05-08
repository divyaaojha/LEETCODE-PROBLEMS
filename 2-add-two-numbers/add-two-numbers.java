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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry =0;
        while(l1 != null || l2 != null || carry!=0) // true|| true|| flase = true;
        {
            int sum = carry;
            if(l1 != null){
                sum+= l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum+= l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            carry = sum/10;
        }

        return dummy.next;

        //doesnt work******** 32/1500
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        // if(l1.val ==0 && l2.val ==0)return l1;
        // ListNode temp =new ListNode(-1);
        // ListNode ans = temp;
        // while(l1 != null){
        //     sb1.append(l1.val);
        //     l1 = l1.next;
        // }
        // sb1.reverse();
        //  while(l2 != null){
        //     sb2.append(l2.val);
        //     l2 = l2.next;
        // }
        // sb2.reverse();
        // int a = Integer.parseInt(sb1.toString());
        // int b = Integer.parseInt(sb2.toString());
        // a = a+b;
        // while(a>0 ){
        //     int rem = a%10;
        //     a = a/10;
            
        //  ans.next = new ListNode(rem);
        //  ans= ans.next;
           
        // }

        // return temp.next;
    }
}