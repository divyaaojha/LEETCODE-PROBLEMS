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
    public ListNode merge(ListNode L1 , ListNode L2){
        ListNode dummy =new ListNode(-1);
        ListNode tail = dummy;

        while(L1 != null && L2 != null){
            if(L1.val <L2.val){
                tail.next =L1;
                L1= L1.next;
            }
            else{
                tail.next = L2;
                L2= L2.next;
            }
            tail=tail.next;
        }
        if(L1 != null){
            tail.next = L1;
            L1= L1.next;
            tail = tail.next;
        }
        if(L2 != null){
           tail.next = L2;
            L2= L2.next;
            tail = tail.next; 
        }
        return dummy.next;// at at first node in dummy is a -1, and slow = dummy, so we created our new list in dummy

    }
    public ListNode sortList(ListNode head) {
        // now trying to reach middle of linked list, and thensending both half of linked list to be sorted by comparison,and merged
        if(head == null || head.next==null)return head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //we reach the middle, now slow is at the head of our right half of linked list, so, cutting it off from the left half
        prev.next = null; // the ll starting from head is pointing to null , and another ll starts from slow 
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);



        //********************************************************************* */
        //tried bruteforce- Accepted
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }
        // Collections.sort(arr);
        // ListNode newhead = head;
        
        // for(int i =0; i< arr.size(); i++){
        //     newhead.val= arr.get(i);
        //     newhead = newhead.next;
        // }

        // return head;
    }
}