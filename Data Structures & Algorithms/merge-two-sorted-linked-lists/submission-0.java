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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3;
        ListNode curr1=list1,curr2=list2,curr3=null;
        list3=curr3;
        while(curr1!=null && curr2!=null){
            if(curr1.val<curr2.val){
                ListNode temp=new ListNode(curr1.val);
                if(curr3==null){
                    curr3=temp;
                    list3=curr3;
                }
                else{
                    curr3.next=temp;
                    curr3=curr3.next;
                }
                curr1=curr1.next;
            }
            else{
                
                ListNode temp=new ListNode(curr2.val);
                if(curr3==null){
            
                    curr3=temp;
                    list3=curr3;
                }
                else{
                    curr3.next=temp;
                    curr3=curr3.next;
                }
                curr2=curr2.next;
            }
        }
        while(curr1!=null){
           
                ListNode temp=new ListNode(curr1.val);
                if(curr3==null){
                    curr3=temp;
                    list3=curr3;
                }
                else{
                    curr3.next=temp;
                    curr3=curr3.next;
                }
                curr1=curr1.next;
        }
        while(curr2!=null){
             ListNode temp=new ListNode(curr2.val);
                if(curr3==null){
                    curr3=temp;
                    list3=curr3;
                }
                else{
                    curr3.next=temp;
                    curr3=curr3.next;
                }
                curr2=curr2.next;
            
        }
  return list3;
    }
}