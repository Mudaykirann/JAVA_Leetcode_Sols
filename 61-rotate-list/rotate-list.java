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
        if(head==null || k == 0) return head;
        ListNode tail = head;
        int Nodelength=1;

        while(tail.next!=null){
            tail=tail.next;
            Nodelength++;
        }
        if(k%Nodelength == 0) return head;
        k=k%Nodelength;
        tail.next=head;
        ListNode newNode = findNode(head,Nodelength-k);
        head=newNode.next;
        newNode.next=null;
        return head;
    }
    public ListNode findNode(ListNode temp,int k){
        int cnt=1;
        while(temp.next!=null){
            if(cnt==k) return temp;
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
}