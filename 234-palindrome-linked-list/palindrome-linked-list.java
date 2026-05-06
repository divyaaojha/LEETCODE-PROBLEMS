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
    public boolean isPalindrome(ListNode head) {
        ArrayList <Integer> arr = new ArrayList<>();
        if(head ==null || head.next == null)return true;
        ListNode temp = head; int k =0;
        while(temp!= null){
            arr.add(temp.val);
            k++;
            temp = temp.next;
        }

        int i = k-1;
        int j = 0;
        while(j<=i ){
            if(arr.get(j)!= arr.get(i))return false;
            j++;
            i--;
        }
        return true;
    }
}