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
     
        if(head ==null || head.next==null){
            return true;
        }
        
        Stack<Integer> store = new Stack<>();
        
        ListNode dummy = head;
        
        while(dummy!=null){
            store.push(dummy.val);
            dummy = dummy.next;
        }
        
        dummy = head;
        
        while(!store.empty()){
            if(dummy.val != store.peek()){
                return false;
            }
            store.pop();
            dummy = dummy.next;
        }
        
        return true;
    }
}