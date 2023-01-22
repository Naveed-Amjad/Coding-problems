

https://leetcode.com/problems/remove-linked-list-elements/solutions/


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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode current = head;
        while(current != null){
            if(current.val == val){
                current = current.next;
                head = current;
            }
            else if (current.next != null && current.next.val == val){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }
}