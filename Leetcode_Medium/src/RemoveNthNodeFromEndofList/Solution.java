package RemoveNthNodeFromEndofList;

import java.util.LinkedList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
   public ListNode removeNthFromEnd(ListNode head, int n) {
       
       LinkedList<ListNode> list = new LinkedList<>();
       while(head!=null){
           
           list.offer(head);
           head = head.next;
       }
       
       ListNode ln = new ListNode();
       ListNode ret = ln;
       int size = list.size();
       int idx=0;
       
       for(ListNode l : list){
           if(idx!=size-n){
              
               ln.next=new ListNode(l.val);
               ln=ln.next;
           }
               
           idx++;
       }
       
       return ret.next;
   }
}