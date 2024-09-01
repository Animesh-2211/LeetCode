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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null ||right==left){
            return head;
        }
       ListNode current=head;
         ListNode prev=null;
         for(int i=1;i<left;i++){
            prev=current;
            current=current.next;
         }

         ListNode initial=prev;
         ListNode fina=current;

         ListNode temp=null;
         ListNode next=null;

         for(int i=left;i<=right;i++){
            next=current.next;
            current.next=temp;
            temp=current;
            current=next;
         }

         if(initial  !=null){
            initial.next=temp;
         } 
         else{
            head=temp;
         }
           fina.next=current;
           return head;


    }
}