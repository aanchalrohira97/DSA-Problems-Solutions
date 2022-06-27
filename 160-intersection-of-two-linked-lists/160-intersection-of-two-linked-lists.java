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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      
        ListNode curA = headA;
        ListNode curB = headB;
        
        if(curA == curB) return curA;
        while(curA!=null){
            while(curB!=null){
                if(curA==curB){
                    return curA;
                }
                curB = curB.next;
            }
            curA = curA.next;
            curB = headB;
        }
      
        return null;
    }
}