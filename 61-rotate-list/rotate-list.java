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
    public ListNode rotateRight(ListNode head, int k) {
       
        if(head==null || head.next==null ||k==0) return head;
        ListNode cur=head;
        int length=1;
       
        while(cur.next!=null){   
            cur=cur.next;
            length++;
        }
        k=k%length;
    
        cur.next=head;
        int steps=length-k;
        ListNode newlast=head;
        for(int i=1;i<steps;i++){
          newlast=newlast.next;
        }
        ListNode newhead=newlast.next;
        newlast.next=null;
    return newhead;
    }
}