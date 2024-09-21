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
    public ListNode deleteDuplicates(ListNode head) {
         HashSet<Integer> st = new HashSet<>();
        
        ListNode prev = null;
        ListNode temp = head;
        
        while (temp != null) {
            if (st.contains(temp.val)) {
                prev.next = temp.next;
            } else {
                st.add(temp.val);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}