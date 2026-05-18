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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevg=dummy;
        while(true){ 
            ListNode kthnode=findkth(prevg,k);
            if(kthnode ==null){
                break;
            }
            ListNode groupnext=kthnode.next;
            ListNode groupstart=prevg.next;
            kthnode.next=null;

            ListNode newhead=reverse(groupstart);
            prevg.next=newhead;
            groupstart.next=groupnext;
            prevg=groupstart;

        }
        return dummy.next;

    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head, prev=null;
        while(curr!=null){
            ListNode neww=curr.next;
            curr.next=prev;
            prev=curr;
            curr=neww;
        }
        return prev;

    }
    public static ListNode findkth(ListNode head,int k){
        ListNode curr=head;
        while(curr!=null&& k>0){
            curr=curr.next;
            k--;


        }
        return curr;
    }
}