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



//last node points to head and second last node points to null
//the above step is one rotation
//repeat the same steps multiple times to satisfy the number of rotations

//seems like a recursive problem
//base case, k=1, do step 1 and k=0, return 
//pass the new link list




class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    
    if(head==null || head.next==null){
        return head;
    }
      
     ListNode fastPointer = head;
    int length = 0;
    
    while(fastPointer!=null){
        fastPointer = fastPointer.next;
        length++;
    }
        
    k = k%length;
    fastPointer = head;
    ListNode lazyPointer = head;
        
   while(k!=0 && fastPointer.next!=null){
       fastPointer = fastPointer.next;
       k--;
   }
        
  while(fastPointer.next!=null){
      lazyPointer = lazyPointer.next;
      fastPointer = fastPointer.next;
  }
  
  //1 2 3 4 5       
  //    l f    
  fastPointer.next = head;
  head = lazyPointer.next;  
  lazyPointer.next = null;  
   
   
    return head;
    }
}