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


/*
    //leading zeros? 
    pointer on linkedlist 1 and linkedlist 2
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode(0);
        ListNode pointer1 = l1, pointer2 = l2, curr = result;
        
        int carryForward = 0;
        
        while(l1!=null || l2!=null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carryForward;
            curr.next = new ListNode(sum%10);
            carryForward = sum/10; 
            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
            curr = curr.next;
        }
        
        if(carryForward>0){
            curr.next = new ListNode(carryForward);
        }
        
        return result.next;
    }
}