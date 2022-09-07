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
        ListNode temp = head;
        int length = getLength(head);
        
        if(length <= 1 || k == 0 || k%length == 0){
            return head;
        }
        
        if(k > length){
            k = k % length;
        }
        
        ListNode prev = null;
        int partition = length - k;
        
        while(partition > 0 && temp!=null){
            prev = temp ;
            temp = temp.next;
            partition--;
        }
        
        prev.next = null;
        ListNode iterator = temp;
        
        if(iterator != null){
            while(iterator.next != null){
                iterator = iterator.next;
            }
            
            iterator.next = head;
        }
        
        return temp;
        
        
        
    }
    
    int getLength(ListNode head){
        int count = 0;
        ListNode temp = head;
         while(temp != null){
             temp = temp.next;
             count ++;
         }
        
        return count;
    }
}