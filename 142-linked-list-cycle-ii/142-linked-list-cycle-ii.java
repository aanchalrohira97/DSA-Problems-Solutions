/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        int index = 0;
        
        Map<ListNode,Integer> position = new HashMap<>();
        
        while(slow!=null){
             if(position.containsKey(slow)){
                 return slow;
             }
            
            position.put(slow,index);
            index++;
            slow = slow.next;
        }
        
        return null;
    }
}