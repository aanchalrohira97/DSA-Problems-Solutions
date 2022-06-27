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
    public ListNode swapPairs(ListNode head) {
     
        swapRecursively(head);
        return head;
        
    }
    
    public void swapRecursively(ListNode head){
        int tempval = 0;
        if(head!=null && head.next!=null){
            tempval = head.val;
            head.val = head.next.val;
            head.next.val = tempval;
            swapRecursively(head.next.next);
        }
    }
}