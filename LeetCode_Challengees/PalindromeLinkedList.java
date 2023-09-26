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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) {
            return true;
        }
        ListNode temp = head;
        ListNode head2 = head;
        
        while(temp != null) {
            if(temp.next == null) {
                head2 = head2.next;
                break;
            }
            head2 = head2.next;
            temp = temp.next.next;
        }
        
     if(head2 != null){
        ListNode newH = null, newNode = null;
        while(head2 != null){
            newNode = head2;
            head2 = head2.next;
            newNode.next = newH;
            newH = newNode;
        }
        head2 = newH;
    }
        
   while(head2 != null){
        if(head2.val != head.val) return false;
        head2 = head2.next; head = head.next;
        }
        
    return true;
        
    }
}
