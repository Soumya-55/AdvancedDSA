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
        int lengthA=length(headA);
        int lengthB=length(headB);
        int diff=Math.abs(lengthA -lengthB);

        if(lengthA>lengthB){
            while(diff-- >0){
                headA=headA.next;
            }
        }
        else{
            while(diff-- >0){
            headB=headB.next;
        }
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;

        }
    
    public int length(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}