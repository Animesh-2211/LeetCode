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
           ListNode fast=head;
        ListNode slow=head;
            boolean got=false;
            int count=0;
        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                got=true;
                break;
            }
        }

         if(got==false){
            return null;
         }

         slow=head;

         while(slow!=fast){
            slow=slow.next;
            count++;
            fast=fast.next;
         }

         return slow;
    


    }
}