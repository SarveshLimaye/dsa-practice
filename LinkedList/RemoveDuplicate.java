//Leetcode q - https://leetcode.com/problems/remove-duplicates-from-sorted-list/


public class RemoveDuplicate {

    // Definition for singly-linked list.
 public class ListNode {
     int val;     
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; } }

    public ListNode deleteDuplicates(ListNode temp) {
        if(temp == null){
            return temp;
        }
        
        ListNode head = temp;
        while(temp.next != null){
            if(temp.val==temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
    
}
