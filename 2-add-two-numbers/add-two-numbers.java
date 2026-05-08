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
        // lists are already reversed, so carry will move in forward direction only
        //aa new list has to be initiated, as after adding 2 numbers, the number of digits can increase

        ListNode dummy = new ListNode(-1); // new ll initiated
        ListNode temp = dummy; // reference to ll dummy

        int carry =0; // inthe beginning no carry

        //there are 2 heads that we will be traversing l1 and l2 both, also we will ad thier value to sum only if they exist
        //so there wont be any problem, if one list is of size say 5, and other of size 3, loop will run, and only add values of list which isnt null,
        // also if carry is not 0 , loop will continue to run, this prevents premature exit from loop in certain cases say 99 + 99 , here carry is 1, l1 and l3 will be null in 3rd iteration, but still there is a carry so, its importain to add thos carry !=0 cond in loop
        //   || operator so that even if any cond true, loop will run
        while(l1 != null || l2 != null || carry !=0 ){
            int sum = carry;
            //l1 node value added
            if(l1!= null){
                sum += l1.val;
                l1= l1.next;
            }
            //now add l2 s node value
            if(l2!= null){
                sum += l2.val;
                l2= l2.next;
            }
            //we need to create a node at temp.next, and then we ll move ahead, so that we arent moving to null
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            carry = sum /10;

        }

        return dummy.next;

































        // ListNode dummy = new ListNode(-1);
        // ListNode temp = dummy;
        // int carry =0;
        // while(l1 != null || l2 != null || carry!=0) // true|| true|| flase = true;
        // {
        //     int sum = carry;
        //     if(l1 != null){
        //         sum+= l1.val;
        //         l1 = l1.next;
        //     }
        //     if(l2 != null){
        //         sum+= l2.val;
        //         l2 = l2.next;
        //     }
        //     temp.next = new ListNode(sum%10);
        //     temp = temp.next;
        //     carry = sum/10;
        // }

        // return dummy.next;
//************************************************************************************************************ */
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