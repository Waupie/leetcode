/**
 * Author:      [Your Name]
 * Date:        28/03/2025
 * Description: This class contains methods to add two numbers represented by singly-linked lists. 
 *              Each node contains a single digit stored in reverse order. The resulting linked list 
 *              represents the sum of the two numbers, with digits also stored in reverse order.
 */


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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }

        ListNode addNodes = new ListNode(sum % 10);
        addNodes.next = addTwoNumbers(l1, l2, sum / 10);
        return addNodes;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // init value of the carry should be 0, there is there a 0 as parameter
        return addTwoNumbers(l1, l2, 0);
    }
    
}