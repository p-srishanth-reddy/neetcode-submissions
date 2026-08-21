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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        int c=0;
         int ans=0;
        ListNode l3=new ListNode();
        ListNode head3=l3;
       ans=head1.val+head2.val+c;
            c=ans/10;
            
            head3.val=ans%10;
            head3.next=null;
            head1=head1.next;
            head2=head2.next;
        while(head1!=null && head2!=null){
            ans=head1.val+head2.val+c;
            c=ans/10;
            ListNode curr=new ListNode(ans%10);
            head1=head1.next;
            head2=head2.next;
            head3.next=curr;
            head3=head3.next;
        }
         while(head1!=null){
            ans=head1.val+c;
            c=ans/10;
            ListNode curr=new ListNode(ans%10);
            head1=head1.next;
            
            head3.next=curr;
            head3=head3.next;
        }
         while( head2!=null){
            ans=head2.val+c;
            c=ans/10;
            ListNode curr=new ListNode(ans%10);
            
            head2=head2.next;
            head3.next=curr;
            head3=head3.next;
        }
        if(c==1){
             ListNode curr=new ListNode(1);
             curr.next=null;
             head3.next=curr;
        }
         return l3;
        
         
    }
}
